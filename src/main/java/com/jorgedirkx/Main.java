package com.jorgedirkx;

public class Main {

        public static void main(String[] args) {
            System.out.println("********************NORMAL ARRAY**************************");
            int[] numberArray = {2,4,8,16,32,64,128,256,512,1028};
            int sum = 0;
            printArray(numberArray);

            System.out.println("*******************STRING ARRAY***************************");
            String[]words ={"word1", "word2"};
            printStringArray(words);

            System.out.println("********************SUM OF NORMAL ARRAY**************************");
            //ADD UP ALL NUMBER
            for (int nr: numberArray
            ) {
                sum+=nr;
            }
            System.out.println("The sum of all the numbers in the array = " + sum);

            //REVERSE ARRAY
            System.out.println("********************REVERSED ARRAY**************************");
            int[] reversedArray = getReversedArray(numberArray);
            printArray(reversedArray);
            System.out.println("********************SQUARED ARRAY**************************");
            int[] squaredArray = getSquaredArray(numberArray);
            printArray(squaredArray);
            System.out.println("********************SORTED ARRAY WITH OWN SORT METHOD**************************");

            //MAKE A RANDOM ARRAY WITH 20 ELEMENTS
            int[] randomNumbers = new int[20];
            for(int i = 0; i< randomNumbers.length; i++){
                randomNumbers[i] = (int) ((Math.random()*100)+1);
            }

            //PRINT THE RANDOM ARRAY
            int[] sortedArray = getSortedArray(randomNumbers);
            printArray(sortedArray);

        }

        //METHODS:

        //Method to reverse an array
        public static int[] getReversedArray(int[] intArray){
            int[] reversed = new int[intArray.length];
            int index = 0;
            for(int i = intArray.length-1; i >=0; i--){
                reversed[i] = intArray[index];
                index++;
            }
            return reversed;
        }

        //method to square all numbers in an array
        public static int[] getSquaredArray(int[] inputArray){
            int[] squared = new int[inputArray.length];
            for(int i = 0; i < inputArray.length; i++){
                squared[i] = inputArray[i] * inputArray[i];
            }
            return squared;
        }

        //method to sort an array
        public static int[] getSortedArray(int[] arrayToSort){
            boolean swapped = false;

            do{
                outerloop:
                for(int i = 0; i < arrayToSort.length; i++){
                    for(int j = 0; j < arrayToSort.length; j++){
                        if(arrayToSort[i] > arrayToSort[j] && j>i){
                            int temp = arrayToSort[j];
                            arrayToSort[j] = arrayToSort[i];
                            arrayToSort[i] = temp;
                            swapped = true;
                            break outerloop;
                        }
                    }
                    if(swapped && i == arrayToSort.length-1){
                        swapped = false;
                    }
                }

            }while(swapped);
            return arrayToSort;
        }


        //Method to print an array
        public static void printArray(int[] inputArray){
            for (int nr: inputArray
            ) {
                System.out.println(nr);
            }
        }

        //Method to print a String array
         public static void printStringArray(String[]inputArray){
            for(String words: inputArray){
                System.out.println(words);
            }
    }



    }





