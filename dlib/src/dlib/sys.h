#ifndef DM_SYS_H
#define DM_SYS_H

namespace dmSys
{
    /**
     * Result code. Similar to standard posix result codes
     */
    enum Result
    {
        RESULT_OK     =  0, //!< RESULT_OK
        RESULT_PERM   = -1, //!< RESULT_PERM
        RESULT_NOENT  = -2, //!< RESULT_NOENT
        RESULT_SRCH   = -3, //!< RESULT_SRCH
        RESULT_INTR   = -4, //!< RESULT_INTR
        RESULT_IO     = -5, //!< RESULT_IO
        RESULT_NXIO   = -6, //!< RESULT_NXIO
        RESULT_2BIG   = -7, //!< RESULT_2BIG
        RESULT_NOEXEC = -8, //!< RESULT_NOEXEC
        RESULT_BADF   = -9, //!< RESULT_BADF
        RESULT_CHILD  = -10,//!< RESULT_CHILD
        RESULT_DEADLK = -11,//!< RESULT_DEADLK
        RESULT_NOMEM  = -12,//!< RESULT_NOMEM
        RESULT_ACCES  = -13,//!< RESULT_ACCES
        RESULT_FAULT  = -14,//!< RESULT_FAULT
        RESULT_BUSY   = -15,//!< RESULT_BUSY
        RESULT_EXIST  = -16,//!< RESULT_EXIST
        RESULT_XDEV   = -17,//!< RESULT_XDEV
        RESULT_NODEV  = -18,//!< RESULT_NODEV
        RESULT_NOTDIR = -19,//!< RESULT_NOTDIR
        RESULT_ISDIR  = -20,//!< RESULT_ISDIR
        RESULT_INVAL  = -21,//!< RESULT_INVAL
        RESULT_NFILE  = -22,//!< RESULT_NFILE
        RESULT_MFILE  = -23,//!< RESULT_MFILE
        RESULT_NOTTY  = -24,//!< RESULT_NOTTY
        RESULT_TXTBSY = -25,//!< RESULT_TXTBSY
        RESULT_FBIG   = -26,//!< RESULT_FBIG
        RESULT_NOSPC  = -27,//!< RESULT_NOSPC
        RESULT_SPIPE  = -28,//!< RESULT_SPIPE
        RESULT_ROFS   = -29,//!< RESULT_ROFS
        RESULT_MLINK  = -30,//!< RESULT_MLINK
        RESULT_PIPE   = -31,//!< RESULT_PIPE

        RESULT_UNKNOWN = -1000,//!< RESULT_UNKNOWN
    };

    /**
     * Create directory.
     * @param path path to directory to create
     * @param mode initial unix file permissions. ignored on some platforms
     * @return RESULT_OK on success
     */
    Result Mkdir(const char* path, uint32_t mode);

    /**
     * Remove empty directory
     * @param path path to directory to remove
     * @return RESULT_OK on success
     */
    Result Rmdir(const char* path);

    /**
     * Remove file
     * @param path path to file to remove
     * @return RESULT_OK on success
     */
    Result Unlink(const char* path);
}

#endif
