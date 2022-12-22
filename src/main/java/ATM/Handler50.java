package ATM;

import lombok.Setter;

public class Handler50 extends Handler {

    @Override
    public void process(int price) {
        System.out.println(price / 50 + " * 50");
        Handler next = getNext();
        if (next != null) {
            getNext().process(price % 50);
        }
    }
}
