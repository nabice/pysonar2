package org.yinwang.pysonar.ast;

import org.jetbrains.annotations.NotNull;

public class Comment extends Node {
    
    public String value;

    public Comment(String value, String file, int start, int end, int line, int col) {
        super(NodeType.COMMENT, file, start, end, line, col);
        this.value = value;
    }

    @NotNull
    @Override
    public String toString() {
        return value;
    }
}
