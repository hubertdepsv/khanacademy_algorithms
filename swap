var swap = function(array, firstIndex, secondIndex) {
    var temp = array[firstIndex];
	array[firstIndex] = array[secondIndex];
	array[secondIndex] = temp;
};

var testArray = [7, 9, 4];
swap(testArray, 0, 1);

println(testArray);

Program.assertEqual(testArray, [9, 7, 4]);

var testArray2 = [2, 3, 1];
swap(testArray2, 1, 2);

Program.assertEqual(testArray2, [2, 1, 3]);

var testArray3 = [3, 4, 2];
swap(testArray3, 0, 1);

Program.assertEqual(testArray3, [4, 3, 2]);
