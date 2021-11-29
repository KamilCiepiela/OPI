import java.util.ArrayList;

class CreateEvenArrayList {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public CreateEvenArrayList() {
    }

    public CreateEvenArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> evenArrayList() {
        ArrayList<Integer> even = new ArrayList<Integer>();

        if (arrayList == null || arrayList.size() == 0) {
            System.out.println("Initial list is empty");
        } else {

            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    even.add(arrayList.get(i));
                }
            }

            System.out.print("Even number is: ");
            for (Integer e : even) {
//                System.out.print(e + ", ");
            }

        }
        return even;
    }

    public static void main(String[] args) {

    }
}