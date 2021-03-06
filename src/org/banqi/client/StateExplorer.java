package org.banqi.client;

/*
 * Copy from https://code.google.com/p/nyu-gaming-course-2013/-
 * source/browse/trunk/eclipse/src/org/shared/chess/
 */

import java.util.Set;

/**
 * Explores the state graph.
 */
public interface StateExplorer {
  /**
   * Returns all the possible moves from the given state.
   */
  Set<Move> getPossibleMoves(BanqiState state);

  /**
   * Returns the possible moves from the given state that begin at start.
   */
  Set<Move> getPossibleMovesFromPosition(BanqiState state, Position start);
  
  /**
   * Returns the list of start positions of all possible moves.
   */
  Set<Position> getPossibleStartPositions(BanqiState state);
}
