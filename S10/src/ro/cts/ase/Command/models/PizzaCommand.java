package ro.cts.ase.Command.models;

import ro.cts.ase.Command.abstracts.ICommand;

import java.util.List;

public class PizzaCommand implements ICommand {
    private Cook cook;
    private List<String> ingredients;

    public PizzaCommand(Cook bucatar, List<String> ingredients) {
        this.cook = bucatar;
        this.ingredients = ingredients;
    }

    @Override
    public void execute() {
        cook.gatestePizza(ingredients);
    }
}
