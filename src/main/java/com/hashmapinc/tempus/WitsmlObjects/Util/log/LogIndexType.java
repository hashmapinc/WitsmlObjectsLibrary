package com.hashmapinc.tempus.WitsmlObjects.Util.log;

/**
 * This is an enum that defines the log index type, either Depth or Time.
 */
public enum LogIndexType {
    /**
     * A log that is typically measured in ft, m, in. Either measured depth or true vertical depth.
     */
    DEPTH,

    /**
     * A log that is measured in time, generally with a unit of seconds, but the format being an ISO8601 time stamp
     * format.
     */
    TIME
}
