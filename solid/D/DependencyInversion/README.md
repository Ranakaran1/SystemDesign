Mouse Interface
-
-
----> Wired Mouse.
----->Bluetooth Mouse


Keyboard Interface
-
-
----> Wired Keyboard
-----> Wireless Keyboard

class macbook{
    private final WiredKeyboard keyboard;
    private final BluetoothMouse mouse;

    Macbook(){
        keyboard = new WiredKeyboard();
        mouse = new BluetoothMouse();
    }
}
// here a class should not depend on classes.. In future, what if the implementation changes? It would break the code.

To adhere to the Dependency Inversion Principle, we should introduce interfaces for the Keyboard and Mouse, allowing the Macbook class to depend on abstractions rather than concrete implementations.

class macbook{
    private final  Keyboard keyboard;
    private final Mouse mouse;

    Macbook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

