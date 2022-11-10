package lp.arvore;

public class Teste_Tree {
   public static void main(String[] args) {
       Tree  testTree = new Tree();

       testTree.insert(9, testTree.root);
       testTree.insert(5, testTree.root);
       testTree.insert(14, testTree.root);
       testTree.insert(2, testTree.root);
       testTree.insert(7, testTree.root);
       testTree.insert(11, testTree.root);
       testTree.insert(4, testTree.root);
       testTree.insert(1, testTree.root);
       testTree.insert(6, testTree.root);
       testTree.insert(8, testTree.root);

       if(!testTree.search(testTree.root, 7, false)){
           System.out.println("Elemento não encontrado");
       }

       System.out.println(testTree);
   } 
}
