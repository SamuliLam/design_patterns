package command;

public class CodeGenerator {
    public String generateCode(Pixel[][] grid) {
        StringBuilder code = new StringBuilder();
        code.append("int[][] pixelArt = {\n");

        for (Pixel[] row : grid) {
            code.append("    {");
            for (int col = 0; col < row.length; col++) {
                code.append(row[col].isToggled() ? "1" : "0");
                if (col < row.length - 1) {
                    code.append(", ");
                }
            }
            code.append("},\n");
        }

        code.deleteCharAt(code.length() - 2); // Remove trailing comma from the last row
        code.append("};");

        return code.toString();
    }
}