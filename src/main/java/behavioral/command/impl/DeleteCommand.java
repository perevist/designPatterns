package behavioral.command.impl;

public class DeleteCommand implements Command{

    private DeleteService deleteService;

    public DeleteCommand(DeleteService deleteService) {
        this.deleteService = deleteService;
    }

    @Override
    public void execute() {
        deleteService.makeDelete();
    }
}
