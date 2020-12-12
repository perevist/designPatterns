package behavioral.command.impl;

public class CopyCommand implements Command {

    private CopyService copyService;

    public CopyCommand(CopyService copyService) {
        this.copyService = copyService;
    }

    @Override
    public void execute() {
        copyService.makeCopy();
    }
}
