package com.example.bonsai;

import java.util.ArrayList;

/**
 * Represents an node in a Skill Tree
 */
public class SkillNode {

    /**
     * ID of this skillNode
     */

    private int mId;

    /**
     * List of stepLists associated with this skill node.
     */
    @com.google.gson.annotations.SerializedName("stepLists")
    private ArrayList<StepList> stepLists;

    /**
     * Item parent SkillNode
     */
    @com.google.gson.annotations.SerializedName("id")
    private SkillNode parent;

    /**
     * Item children SkillNodes
     */
    @com.google.gson.annotations.SerializedName("complete")
    private ArrayList<SkillNode> children;

    /**
     * SkillNode constructor
     */
    public SkillNode(int mId) {
        this.mId = mId;
    }

    public ArrayList<StepList> getStepLists() {
        return stepLists;
    }

    public SkillNode getParent() {
        return parent;
    }

    public ArrayList<SkillNode> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof SkillNode && ((SkillNode) o).mId == mId;
    }
}