package org.spring.solidfoundations.coreJava.oop.constructor.supers.noArgSupers;

public class Sub extends Master{
    public Sub() {
        // here there is an implicit super()
        // this is because master has no args cons.
        System.out.println("Child constructor");
        print();
    }

    // since this has overridden the parent, when parent calls print inside its constructor the child is used.
    // because there can only be one method available of the same type and since print is overridden this one is used.
    @Override
    public void print() {
        super.print();
        System.out.println("Child prints");
    }

    // 1, master cons is called
    // 2, master cons calls print but the child's print is used.
    // 3, child's print calls the parent print method
    // 4, master's print runs
    // 5, then statement in child's print runs
    // 6, then the rest of code in the child's const runs (sout and print)
}
