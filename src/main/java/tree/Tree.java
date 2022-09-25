package tree;
public class Tree {
    Treenode root;
    public  class  Treenode{
        Integer data;
        Treenode left;
        Treenode right;
       public  Treenode(int x) {
            this.data = x;
            this.left=null;
            this.right = null;
        }
    }
    public void createTree(int x){
        Treenode obj = new Treenode(x);

        if (root == null){
            root =obj;
            System.out.println("root -->" +root.data);
        }
            Treenode temp = root;
            while(root != null){
                if(root.left == null) {
                    root.left =obj;
                    root= root.left;
                    System.out.println("added to left");
                    continue;
                }
                else if (root.right == null) {
                    root.right =obj;
                    root = root.right;
                    System.out.println("added to right");
                }

            }
    }


    public static void main(String[] args){
        Tree t1 = new Tree();
        t1.createTree(2);
        t1.createTree(3);
       // t1.createTree(3);
    }

}
