// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladores/PL2Compiladores\g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void enterCsvFile(gParser.CsvFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void exitCsvFile(gParser.CsvFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(gParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(gParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(gParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(gParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(gParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(gParser.FieldContext ctx);
}