package com.scaler.tictactoe.strategies.botplayingstrategy;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Bot;
import com.scaler.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move decideMove(Bot bot, Board board);
}
