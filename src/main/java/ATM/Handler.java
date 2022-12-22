package ATM;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {

    @Setter @Getter
    private Handler next;
    public abstract void process(int price);
}
