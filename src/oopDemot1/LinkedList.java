package oopDemot1;

class Link {
    public int data1;
    public int index;
    public Link nextLink;

    // Link konstruktori
    public Link(int d1, int indeksi) {
        data1 = d1;
        index = indeksi;
    }

    // Printtaa lista
    public void printLink() {
        System.out.print("{" + data1 + "} ");
    }
    
    // Antaa olion indeksin
    public int linkIndex() {
    	return index;
    }
}

class LinkList {
    private Link first;
    private int size;
	private Link currentLink;

    //LinkList konstruktori
    public LinkList() {
        first = null;
    }

    //Palauttaa true, jos lista on tyhjä
    public boolean isEmpty() {
        return first == null;
    }

    //Sijoittaa uuden Linkin listan alkuun
    public void insert(int d1) {
        Link link = new Link(d1, getSize());
        link.nextLink = first;
        first = link;
        setSize(getSize() + 1);
    }

    //Poistaa Linkin, joka on listan ensimmäisenä
    public Link delete() {
        Link temp = first;
        first = first.nextLink;
        return temp;
    }
    
    //Ottaa seuraavan Linkin listasta. 
    //Jos viimeinen indeksi, tulee virhe.
    //FIXME
    public Link getNext(int index) {
    	currentLink = first;
    	if (index < getSize()) {
	    	for (int i = 0; i<getSize(); i++) {
	    		currentLink = currentLink.nextLink;
	    		if (i == currentLink.linkIndex()) {
	    			break;
	    		}
	    	}
    	} else {
    		System.out.println("Indeksi menee yli.");
    		return null;
    	}
    	
    	return currentLink.nextLink;
    }

    //Printtaa listan ulos
    public void printList() {
        Link currentLink = first;
        System.out.print("Lista: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}  

class LinkedList {
    public static void main(String[] args) {
        LinkList lista = new LinkList();

        lista.insert(1);
        lista.insert(2);
        System.out.println(lista.getSize());
        lista.insert(3);
        lista.insert(4);
        lista.insert(5);
        
        System.out.println(lista.getSize());
        
        lista.printList();

        while(!lista.isEmpty()) {
            Link deletedLink = lista.delete();
            System.out.print("deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        lista.printList();
    }
}