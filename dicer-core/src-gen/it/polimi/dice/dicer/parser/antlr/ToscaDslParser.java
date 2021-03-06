/*
 * generated by Xtext 2.10.0
 */
package it.polimi.dice.dicer.parser.antlr;

import com.google.inject.Inject;
import it.polimi.dice.dicer.parser.antlr.internal.InternalToscaDslParser;
import it.polimi.dice.dicer.services.ToscaDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ToscaDslParser extends AbstractAntlrParser {

	@Inject
	private ToscaDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalToscaDslParser createParser(XtextTokenStream stream) {
		return new InternalToscaDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TopologyTemplate";
	}

	public ToscaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ToscaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
