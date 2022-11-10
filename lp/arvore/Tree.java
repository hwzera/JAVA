package lp.arvore;

public class Tree {
    
    Node root = null;


    public void insert(int info, Node node){
        
        if (node == null){
            root = new Node(info);
            System.out.println("Criando a árvore...!\nroot = " + root.info);
            return;
        }

        if (node.info > info){
            // Inserir a esq
            if(node.esq == null){
                node.esq = new Node(info);
                return;
            }
            insert(info, node.esq);
        }
        
        else{
            // iserir a dir
            if (node.dir == null){
                node.dir = new Node(info);
                return;
            }

            insert(info, node.dir);
        }
    }

    public boolean isNode(Node n){
        return n != null;
    }

    public boolean search(Node node, int valor, boolean found){

        boolean retorno = found;


        if(node == null){
            System.out.println("Árvore Vazia!");
            return false;
        }

        if (valor == node.info){

            System.out.println("\nElemento encontrado");
            int qto = 0; //contagem de filhos
            int fEsq = 0, fDir = 0;

            if (node.esq != null){
                qto++;
                fEsq = node.esq.info;
            }
            if (node.dir != null){
                qto++;
                fDir = node.dir.info;
            }

            System.out.println("\nO elemento " +
                                node.info + " tem " + 
                                qto + " filho(os) \n");

            if(fEsq != 0) { 
                System.out.println("Filho esq: " + fEsq);
            }

            if(fDir != 0) { 
                System.out.println("Filho dir: " + fDir);
            }

            // System.out.printf("%nO elemento %d tem %d filho(os)%nFilho Esq = %d\tFilho Dir = %d%n%n", node.info, qto, fEsq, fDir);

            return true;
        }

        System.out.println(node.info);

        if(node.esq != null){
           retorno =  search(node.esq, valor, retorno);
        }

        if(node.dir != null){
           retorno =  search(node.dir, valor, retorno);
        }

        return retorno;
    }

    public void pre_order(Node node){
        if(node == null){
            System.out.println("Árvore Vazia!");
            return;
        }

        System.out.println(node.info);

        if(node.esq != null){
              pre_order(node.esq);
        }

        if(node.dir != null){
            pre_order(node.dir);
        }
    }

    public void in_order(Node node){

        if(node == null){
            System.out.println("Ávore Vazia!");
            return;
        }

        if(node.esq != null){
            in_order(node.esq);
            return;   
        }

        System.out.println(node.info);

        if(node.dir != null){
            in_order(node.dir);
            return;
        }
    }

    public void post_order(Node node){
        if(node == null){
            System.out.println("Área Vazia!");
            return;
        }

        if(node.esq == null){
            post_order(node.esq);
            return;
        }

        if(node.dir == null){
            post_order(node.dir);
            return;
        }

        System.out.println(node.info);
    }

    @Override
    public String toString(){
        this.in_order(root);
        return "";
    }
}
