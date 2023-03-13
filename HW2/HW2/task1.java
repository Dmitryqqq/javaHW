package HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class task1 {
    
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,8,3,4,1,9};
        
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+",");
        }
        System.out.println();

        bubble(arr);
        System.out.println("Получилось!)");

    }
    public static int[] bubble (int[] arr1) {
        String file_name = "1.txt";
        File file = new File(file_name);
        int n = arr1.length;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (arr1[j] > arr1[j+1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;

                    try{
                        FileWriter writer = new FileWriter(file,true);
                        for (int k = 0; k < n; k++){
                            
                        writer.write ( arr1[k] + ",");
                        
                        }
                        writer.write("\n");
                        
                        writer.close();
                        
                        }
                    catch (Exception e){
                        System.out.println("Что то пошло не так");
                        }
                    
                }
            }
            
        }
        try{
            FileWriter writer = new FileWriter(file,true);
            
            writer.write(" O K !\n");
            
            writer.close();
            
            }
        catch (Exception e){
            System.out.println("Что то пошло не так");
            }
        //writer.write("Получилось \n");
        //writer.close();
        return arr1;
    }
 
    }

