package command;

public class GenerateCodeCommand implements Command {
    private Pixel[][] grid;
    private CodeGenerator codeGenerator;

    public GenerateCodeCommand(Pixel[][] grid) {
        this.grid = grid;
        this.codeGenerator = new CodeGenerator();
    }

    @Override
    public void execute() {
        String code = codeGenerator.generateCode(grid);
        System.out.println(code);
    }
}