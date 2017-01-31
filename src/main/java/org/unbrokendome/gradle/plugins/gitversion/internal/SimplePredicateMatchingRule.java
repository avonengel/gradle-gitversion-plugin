package org.unbrokendome.gradle.plugins.gitversion.internal;

import org.gradle.api.Action;
import org.unbrokendome.gradle.plugins.gitversion.core.RuleContext;

import java.util.function.Predicate;

import javax.annotation.Nonnull;


public class SimplePredicateMatchingRule extends AbstractPredicateMatchingRule<RuleContext> {

    SimplePredicateMatchingRule(Action<RuleContext> action, Predicate<RuleEvaluationContext> predicate) {
        super(action, predicate);
    }


    @Override
    @Nonnull
    protected SimpleRuleContext createContext(RuleEvaluationContext evaluationContext) {
        return new SimpleRuleContext(evaluationContext);
    }
}