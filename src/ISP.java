public class ISP
{

}

interface Printer
{
    void print();
    void scan();
    void fax();
}

class ClassicPrinter implements Printer
{

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }

    @Override
    public void fax() {

    }
}

//class OldStylePrinter implements Printer
//{
//
//    @Override
//    public void print() {
//
//    }
//
////    @Override
////    public void scan() {
////        return null;
////
////    }
////
////    @Override
////    public void fax() {
////
////    }
//}

interface print
{
    void print();
}

interface fax
{
    void fax();
}

interface scan
{
    void scan();
}

class OldStylePrinter implements print
{

    @Override
    public void print() {

    }
}

class NewStylePrinter implements print,scan,fax
{

    @Override
    public void print() {

    }

    @Override
    public void fax() {

    }

    @Override
    public void scan() {

    }
}