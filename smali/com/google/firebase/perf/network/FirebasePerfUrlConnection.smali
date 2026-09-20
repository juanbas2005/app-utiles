.class public Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public static getContent(Ljava/net/URL;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lhn7;->O:Lhn7;

    .line 2
    .line 3
    new-instance v1, Lui7;

    .line 4
    .line 5
    invoke-direct {v1}, Lui7;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lui7;->d()V

    .line 9
    .line 10
    .line 11
    iget-wide v2, v1, Lui7;->w:J

    .line 12
    .line 13
    new-instance v4, Lsy4;

    .line 14
    .line 15
    invoke-direct {v4, v0}, Lsy4;-><init>(Lhn7;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v5, v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    new-instance v5, Lbe3;

    .line 27
    .line 28
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 29
    .line 30
    invoke-direct {v5, v0, v1, v4}, Lbe3;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lui7;Lsy4;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v5, Lbe3;->a:Lce3;

    .line 34
    .line 35
    invoke-virtual {v0}, Lce3;->b()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    instance-of v5, v0, Ljava/net/HttpURLConnection;

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    new-instance v5, Lae3;

    .line 47
    .line 48
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 49
    .line 50
    invoke-direct {v5, v0, v1, v4}, Lae3;-><init>(Ljava/net/HttpURLConnection;Lui7;Lsy4;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v5, Lae3;->a:Lce3;

    .line 54
    .line 55
    invoke-virtual {v0}, Lce3;->b()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_1
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    return-object p0

    .line 65
    :goto_0
    invoke-virtual {v4, v2, v3}, Lsy4;->f(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lui7;->b()J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    invoke-virtual {v4, v1, v2}, Lsy4;->i(J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v4, p0}, Lsy4;->j(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v4}, Lty4;->c(Lsy4;)V

    .line 83
    .line 84
    .line 85
    throw v0
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

.method public static getContent(Ljava/net/URL;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6

    .line 86
    sget-object v0, Lhn7;->O:Lhn7;

    .line 87
    new-instance v1, Lui7;

    invoke-direct {v1}, Lui7;-><init>()V

    .line 88
    invoke-virtual {v1}, Lui7;->d()V

    .line 89
    iget-wide v2, v1, Lui7;->w:J

    .line 90
    new-instance v4, Lsy4;

    invoke-direct {v4, v0}, Lsy4;-><init>(Lhn7;)V

    .line 91
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    .line 92
    instance-of v5, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v5, :cond_0

    .line 93
    new-instance v5, Lbe3;

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v5, v0, v1, v4}, Lbe3;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lui7;Lsy4;)V

    .line 94
    iget-object v0, v5, Lbe3;->a:Lce3;

    invoke-virtual {v0, p1}, Lce3;->c([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    .line 95
    :cond_0
    instance-of v5, v0, Ljava/net/HttpURLConnection;

    if-eqz v5, :cond_1

    .line 96
    new-instance v5, Lae3;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-direct {v5, v0, v1, v4}, Lae3;-><init>(Ljava/net/HttpURLConnection;Lui7;Lsy4;)V

    .line 97
    iget-object v0, v5, Lae3;->a:Lce3;

    invoke-virtual {v0, p1}, Lce3;->c([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 98
    :cond_1
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 99
    :goto_0
    invoke-virtual {v4, v2, v3}, Lsy4;->f(J)V

    .line 100
    invoke-virtual {v1}, Lui7;->b()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lsy4;->i(J)V

    .line 101
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p0

    .line 102
    invoke-virtual {v4, p0}, Lsy4;->j(Ljava/lang/String;)V

    .line 103
    invoke-static {v4}, Lty4;->c(Lsy4;)V

    .line 104
    throw p1
.end method

.method public static instrument(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbe3;

    .line 6
    .line 7
    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    .line 8
    .line 9
    new-instance v1, Lui7;

    .line 10
    .line 11
    invoke-direct {v1}, Lui7;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lhn7;->O:Lhn7;

    .line 15
    .line 16
    new-instance v3, Lsy4;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Lsy4;-><init>(Lhn7;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, v1, v3}, Lbe3;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lui7;Lsy4;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lae3;

    .line 30
    .line 31
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 32
    .line 33
    new-instance v1, Lui7;

    .line 34
    .line 35
    invoke-direct {v1}, Lui7;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v2, Lhn7;->O:Lhn7;

    .line 39
    .line 40
    new-instance v3, Lsy4;

    .line 41
    .line 42
    invoke-direct {v3, v2}, Lsy4;-><init>(Lhn7;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p0, v1, v3}, Lae3;-><init>(Ljava/net/HttpURLConnection;Lui7;Lsy4;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    return-object p0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static openStream(Ljava/net/URL;)Ljava/io/InputStream;
    .locals 6

    .line 1
    sget-object v0, Lhn7;->O:Lhn7;

    .line 2
    .line 3
    new-instance v1, Lui7;

    .line 4
    .line 5
    invoke-direct {v1}, Lui7;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lhn7;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {v1}, Lui7;->d()V

    .line 26
    .line 27
    .line 28
    iget-wide v2, v1, Lui7;->w:J

    .line 29
    .line 30
    new-instance v4, Lsy4;

    .line 31
    .line 32
    invoke-direct {v4, v0}, Lsy4;-><init>(Lhn7;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v5, v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    new-instance v5, Lbe3;

    .line 44
    .line 45
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 46
    .line 47
    invoke-direct {v5, v0, v1, v4}, Lbe3;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lui7;Lsy4;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v5, Lbe3;->a:Lce3;

    .line 51
    .line 52
    invoke-virtual {v0}, Lce3;->e()Ljava/io/InputStream;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    instance-of v5, v0, Ljava/net/HttpURLConnection;

    .line 60
    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    new-instance v5, Lae3;

    .line 64
    .line 65
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 66
    .line 67
    invoke-direct {v5, v0, v1, v4}, Lae3;-><init>(Ljava/net/HttpURLConnection;Lui7;Lsy4;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v5, Lae3;->a:Lce3;

    .line 71
    .line 72
    invoke-virtual {v0}, Lce3;->e()Ljava/io/InputStream;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_2
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 78
    .line 79
    .line 80
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    return-object p0

    .line 82
    :goto_0
    invoke-virtual {v4, v2, v3}, Lsy4;->f(J)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lui7;->b()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    invoke-virtual {v4, v1, v2}, Lsy4;->i(J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v4, p0}, Lsy4;->j(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4}, Lty4;->c(Lsy4;)V

    .line 100
    .line 101
    .line 102
    throw v0
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
