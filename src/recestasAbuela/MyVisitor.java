package recestasAbuela;

public class MyVisitor extends recetasBaseVisitor<Object> {

    @Override public Object visitProg(recetasParser.ProgContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFila(recetasParser.FilaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReceta(recetasParser.RecetaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitConclusion(recetasParser.ConclusionContext ctx) { return visitChildren(ctx); }
}
