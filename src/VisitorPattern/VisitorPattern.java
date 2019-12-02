/**
 *  -> Visitor Pattern
 *
 *  1. Create a visitable interface with a function that can accept a visitor
 *  2. Create a visitor interface that overloads the same method by
 *     taking in different types of visitors
 *  3. Implement different visitors with visit functions for each type of visitor
 *
 */

package VisitorPattern;

interface Visitable {
    void accept(Visitor visitor);
}

interface Visitor {
    void visit(ExportPDF exportPDF);
    void visit(ExportXML exportXML);
}

class PrintFile implements Visitor {
    @Override
    public void visit(ExportPDF exportPDF) {
        System.out.println("Exporting to PDF...");
    }

    @Override
    public void visit(ExportXML exportXML) {
        System.out.println("Exporting to XML...");
    }
}

class ReadFile implements Visitor {
    @Override
    public void visit(ExportPDF exportPDF) {
        System.out.println("Reading PDF...");
    }

    @Override
    public void visit(ExportXML exportXML) {
        System.out.println("Reading XML...");
    }
}

class ExportPDF implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class ExportXML implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Test {
    public static void main(String[] args) {
        ExportXML xml = new ExportXML();
        ExportPDF pdf = new ExportPDF();

        xml.accept(new PrintFile());
        xml.accept(new ReadFile());
        pdf.accept(new PrintFile());
        pdf.accept(new PrintFile());
    }
}
