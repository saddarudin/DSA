package lab2;
public class ContactApp {
    void displayAllContacts(String[][] arr){
        System.out.println("Name    Mobile Number");
        for (String[] contact : arr) {
            System.out.println(contact[0] + "    " + contact[1]);
        }
    }
    int searchContact(String[][] arr, String name){
        for (int i=0;i<arr.length;i++) {
            if(name.equals(arr[i][0])||name.equals(arr[i][1]))return i;
        }
        return -1;
    }
    String[][] addNewContact(String[][] arr,String name,String mobile,int index){
        String[][] array=new String[arr.length+1][2];
            int count=0;
            for (int i=0;i<array.length;i++){
                if(i==index){
                    array[index][0]=name;
                    array[index][1]=mobile;
                }
                else{
                    array[i][0]=arr[count][0];
                    array[i][1]=arr[count][1];
                    count++;
                }
            }
        return array;
    }
    void updateContactName(String[][] arr,String target,String replacement) {
        int index=searchContact(arr,target);
        if(index>=0)arr[index][0]=replacement;
        else System.out.print(target+" not found in contact app!");
    }
    void updateContactNumber(String[][] arr,String target,String replacement) {
        int index=searchContact(arr,target);
        if(index>=0)arr[index][1]=replacement;
        else System.out.print(target+" not found in contact app!");
    }
    String[][] deleteContact(String[][] arr, String target){
        int index=searchContact(arr,target);
        String[][] delete=new String[arr.length-1][2];
        if(index>=0){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(i!=index){
                    delete[count][0]=arr[i][0];
                    delete[count][1]=arr[i][1];
                    count++;
                }
            }
        }else{
            System.out.print("Contact does not exist!");
            return arr;
        }
        return delete;
    }
}