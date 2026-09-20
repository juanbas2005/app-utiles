.class public final Lnz4;
.super Lsp3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public static M(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;
    .locals 4

    .line 1
    invoke-static {p0}, Lpa4;->d(Ljava/nio/file/attribute/FileTime;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final E(Lae5;)Ldq1;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lae5;->w:Ldg0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ldg0;->r()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p1, 0x0

    .line 11
    new-array v0, p1, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p0, v0}, Lpa4;->m(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :try_start_0
    const-class v1, Ljava/nio/file/attribute/BasicFileAttributes;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    new-array v2, v2, [Ljava/nio/file/LinkOption;

    .line 25
    .line 26
    sget-object v3, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    .line 27
    .line 28
    aput-object v3, v2, p1

    .line 29
    .line 30
    invoke-static {p0, v1, v2}, Ljava/nio/file/Files;->readAttributes(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/file/FileSystemException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->isSymbolicLink()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-static {p0}, Ljava/nio/file/Files;->readSymbolicLink(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object p0, v0

    .line 46
    :goto_0
    new-instance v1, Ldq1;

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->isRegularFile()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->isDirectory()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    sget-object v4, Lae5;->x:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ltz2;->k(Ljava/lang/String;)Lae5;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    move-object v4, p0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move-object v4, v0

    .line 71
    :goto_1
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->size()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->creationTime()Ljava/nio/file/attribute/FileTime;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-eqz p0, :cond_2

    .line 84
    .line 85
    invoke-static {p0}, Lnz4;->M(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    move-object v6, p0

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move-object v6, v0

    .line 92
    :goto_2
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->lastModifiedTime()Ljava/nio/file/attribute/FileTime;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-eqz p0, :cond_3

    .line 97
    .line 98
    invoke-static {p0}, Lnz4;->M(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    move-object v7, p0

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move-object v7, v0

    .line 105
    :goto_3
    invoke-interface {p1}, Ljava/nio/file/attribute/BasicFileAttributes;->lastAccessTime()Ljava/nio/file/attribute/FileTime;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eqz p0, :cond_4

    .line 110
    .line 111
    invoke-static {p0}, Lnz4;->M(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :cond_4
    move-object v8, v0

    .line 116
    invoke-direct/range {v1 .. v8}, Ldq1;-><init>(ZZLae5;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    :catch_0
    return-object v0
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final k(Lae5;Lae5;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object p0, p1, Lae5;->w:Ldg0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldg0;->r()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x0

    .line 14
    new-array v0, p1, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0, v0}, Lpa4;->m(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p2, p2, Lae5;->w:Ldg0;

    .line 24
    .line 25
    invoke-virtual {p2}, Ldg0;->r()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-array v0, p1, [Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p2, v0}, Lpa4;->m(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    new-array v0, v0, [Ljava/nio/file/CopyOption;

    .line 40
    .line 41
    sget-object v1, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 42
    .line 43
    aput-object v1, v0, p1

    .line 44
    .line 45
    sget-object p1, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    aput-object p1, v0, v1

    .line 49
    .line 50
    invoke-static {p0, p2, v0}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p0

    .line 55
    goto :goto_0

    .line 56
    :catch_1
    const-string p0, "atomic move not supported"

    .line 57
    .line 58
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/nio/file/NoSuchFileException;->getMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {p1, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NioSystemFileSystem"

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
