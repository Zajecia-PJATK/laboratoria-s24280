class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + getName() +
                ",email=" + getEmail() +
                ",gender=" + getGender() +
                ']';
    }
}
class Book {
    String name;
    static int n;
    private Author[] author;
    double price;
    int qty = 0;
    public Book(String name, double price, Author[] author) {
        this.name=name;
        assert false;
        this.author = author;
        this.price=price;
    }

    public Book(String name, double price, Author[] author, int qty) {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return author;
    }
    public String getAuthorNames() {
        String str = "";
        for (Author author: author) {
            str += author.getName() + ",";
        }
            str.substring(0, str.length() - 1);
            return str;
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String str = "";
        for(Author author: author){
            str += "Author[name="+ author.getName() + ",email=" + author.getEmail() + ",gender="+ author.getGender()+"], ";
        }
        str = str.substring(0, str.length() - 2);
        return "Book[name=" + name + ",price=" + price +",authors=[" + str + "],qty=" + qty + ']';
    }
}