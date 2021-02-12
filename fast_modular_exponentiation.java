//Fast Modular Exponentiation
//by Cameron

//adjust x,y,z to calculate x^y mod z
var x=98765;
var y=1234;
var z=123557;

//converts a non-negative integer to 
//binary represented by a string of 1s and 0s 
var numtobin=function(num){
    var bintext="";
    var bits=floor(log(num)/log(2))+1;
    var currentnum=num;
    for(var i=0;i<bits;i++){
        bintext= currentnum%2 + bintext;
        currentnum=floor(currentnum/2);
    }
    return bintext;
};

//converts a binary number (represented by a string of 1s
//and 0s) to a non-negative integer 
var bintonum=function(binchars){
    var binnum=0;
    var multiplier=1;
    for(var i=0;i<binchars.length;i++){
        if(binchars[binchars.length-i-1]==="1"){
            binnum += 1*multiplier;    
        }
        multiplier*=2;
    }
    return binnum;
};

//calculates A mod B (using quotient remainder theorem)
var mymod=function(A,B){
    //A=B*Q+R, where  0 <= R < B
    //A mod B = R
    //R= A-B*Q, Q=floor(A/B)
    return A-floor(A/B)*B;
};

//calculates A^B mod C using fast modular exponentiation
var fastmodexp=function(A,B,C){
    fill(0, 0, 0);
   
    var linelength=(""+A+"^"+B+" mod "+C+"="+C).length;

    var binB= numtobin(B);
    text(B + "=" + binB + " in binary",20,60);
    
    var Bdigits= binB.length;
    
    var AtoBmodC=[];
    
    var power=1;
    var product=0;
    var thisline="";
    for(var i=0; i<Bdigits; i++){
        if(i===0){
            AtoBmodC[0]= mymod(A,C);
        }
        else{
            AtoBmodC[i]= mymod(AtoBmodC[i-1]*AtoBmodC[i-1],C);
        }
        
        thisline=""+A+"^"+power+" mod "+C + "=" +AtoBmodC[i];
        
       
        if(binB.charAt(Bdigits-1-i)==="1"){
            
            for(var j=thisline.length;j<linelength+10;j++){
                thisline += "  ";
            }
            thisline += AtoBmodC[i];
            
            if(product===0){
                product= AtoBmodC[i];
            }else{
                product *= AtoBmodC[i];
            }
            product=mymod(product,C);
        }
        text(thisline,20,100+20*i);
        
        power *=2;
    }
    line(20,100+20*i,380,100+20*i);
    thisline= ""+A+"^"+B+" mod "+C+" = ";
    thisline += product+" mod "+C;
    text(thisline,20,100+20*i+20);
    
    var result=mymod(product,C);
    fill(255, 0, 0);
    text(A+"^"+B+" mod "+C+" = "+result,20,100+20*i+40);
    text(A+"^"+B+" mod "+C+" = "+result,20,20);
    return result;
};

fastmodexp(x,y,z);



fill(255, 0, 0);
