q(y) is correct which y belong to Parents
q(x) should be correct which x belong to Children
in which Children is subtype of Parents

class Parents {
    method() {
        calculate
    }
}


class Children extends Parents {
    method() {
        calculate1
    }
}

class Children2 extends Parents {
    method() {
        calculate2
    }
}

class Main() {
    public void execute() {
        Parents a1 = new Children();
        Parents a2 = new Children2();

        a1.method() => correct;
        a2.method() => not correct
    }
}
