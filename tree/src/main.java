public class main {



    public static void main(String[] args){

        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(5);
        bt.add(8);
        bt.add(4);
        bt.add(10);
        bt.add(3);
        bt.add(7);
        bt.add(11);
        bt.add(0);
        bt.add(6);


        System.out.println(bt.toString());
        if(bt.contain(2)){
            System.out.println("contain");
        } else System.out.println("NOT CONTAIN");

    }





}
