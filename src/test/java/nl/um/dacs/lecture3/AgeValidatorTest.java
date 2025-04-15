package nl.um.dacs.lecture3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AgeValidatorTest {
    
    @Test
    public void testNegativeAge_Invalid() {
        assertFalse(AgeValidator.isEligibleToVote(-1));
        assertFalse(AgeValidator.isEligibleToVote(-10));
    }

    @Test
    public void testTooYoungToVote() {
        assertFalse(AgeValidator.isEligibleToVote(0));
        assertFalse(AgeValidator.isEligibleToVote(10));
        assertFalse(AgeValidator.isEligibleToVote(17));
    }

    @Test
    public void testValidVotingAge() {
        assertTrue(AgeValidator.isEligibleToVote(18));
        assertTrue(AgeValidator.isEligibleToVote(120));
        assertTrue(AgeValidator.isEligibleToVote(28));
    }

    @Test
    public void testTooOld_Invalid() {
        assertFalse(AgeValidator.isEligibleToVote(121));
        assertFalse(AgeValidator.isEligibleToVote(150));
    }
}


