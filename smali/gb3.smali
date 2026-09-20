.class public final Lgb3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/lang/Object;

.field public final d:I

.field public e:Ljava/time/Instant;

.field public f:Lgb3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^[^\\[\\]]*:[^\\[\\]]*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lgb3;->g:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "[/?#]"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lgb3;->h:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgb3;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {}, Lrk0;->k()Ljava/time/Instant;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lgb3;->e:Ljava/time/Instant;

    .line 16
    .line 17
    iput-object p2, p0, Lgb3;->a:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p3, p0, Lgb3;->b:Z

    .line 20
    .line 21
    iput p1, p0, Lgb3;->d:I

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
.end method

.method public static b(Ljava/lang/String;)Lgb3;
    .locals 5

    .line 1
    const-string v0, "wg://"

    .line 2
    .line 3
    sget-object v1, Lgb3;->h:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const-class v3, Lgb3;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 19
    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ltz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const v4, 0xffff

    .line 46
    .line 47
    .line 48
    if-gt v0, v4, :cond_0

    .line 49
    .line 50
    :try_start_1
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Leb3;->a(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 55
    .line 56
    .line 57
    new-instance p0, Lgb3;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-direct {p0, v2, v0, v3}, Lgb3;-><init>(ILjava/lang/String;Z)V
    :try_end_1
    .catch Lcom/wireguard/config/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :catch_0
    new-instance p0, Lgb3;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-direct {p0, v1, v0, v2}, Lgb3;-><init>(ILjava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_0
    new-instance v0, Lcom/wireguard/config/ParseException;

    .line 88
    .line 89
    const-string v1, "Missing/invalid port number"

    .line 90
    .line 91
    invoke-direct {v0, v3, p0, v1, v2}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :catch_1
    move-exception v0

    .line 96
    new-instance v1, Lcom/wireguard/config/ParseException;

    .line 97
    .line 98
    invoke-direct {v1, v3, p0, v2, v0}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :cond_1
    new-instance v0, Lcom/wireguard/config/ParseException;

    .line 103
    .line 104
    const-string v1, "Forbidden characters"

    .line 105
    .line 106
    invoke-direct {v0, v3, p0, v1, v2}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 107
    .line 108
    .line 109
    throw v0
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


# virtual methods
.method public final a()Ljava/util/Optional;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lgb3;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgb3;->c:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Lgb3;->e:Ljava/time/Instant;

    .line 14
    .line 15
    invoke-static {}, Lfb3;->j()Ljava/time/Instant;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v1, v2}, Lfb3;->i(Ljava/time/temporal/Temporal;Ljava/time/Instant;)Ljava/time/Duration;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lfb3;->d(Ljava/time/Duration;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    const-wide/16 v3, 0x1

    .line 28
    .line 29
    cmp-long v1, v1, v3

    .line 30
    .line 31
    if-lez v1, :cond_3

    .line 32
    .line 33
    :try_start_1
    iget-object v1, p0, Lgb3;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x0

    .line 40
    aget-object v3, v1, v2

    .line 41
    .line 42
    array-length v4, v1

    .line 43
    :goto_0
    if-ge v2, v4, :cond_2

    .line 44
    .line 45
    aget-object v5, v1, v2

    .line 46
    .line 47
    instance-of v6, v5, Ljava/net/Inet4Address;

    .line 48
    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    move-object v3, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_3

    .line 58
    :cond_2
    :goto_1
    new-instance v1, Lgb3;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget v3, p0, Lgb3;->d:I

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    invoke-direct {v1, v3, v2, v4}, Lgb3;-><init>(ILjava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lgb3;->f:Lgb3;

    .line 71
    .line 72
    invoke-static {}, Lfb3;->j()Ljava/time/Instant;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p0, Lgb3;->e:Ljava/time/Instant;
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catch_0
    const/4 v1, 0x0

    .line 80
    :try_start_2
    iput-object v1, p0, Lgb3;->f:Lgb3;

    .line 81
    .line 82
    :cond_3
    :goto_2
    iget-object p0, p0, Lgb3;->f:Lgb3;

    .line 83
    .line 84
    invoke-static {p0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    monitor-exit v0

    .line 89
    return-object p0

    .line 90
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    throw p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lgb3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lgb3;

    .line 8
    .line 9
    iget-object v0, p0, Lgb3;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p1, Lgb3;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget p0, p0, Lgb3;->d:I

    .line 20
    .line 21
    iget p1, p1, Lgb3;->d:I

    .line 22
    .line 23
    if-ne p0, p1, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    return v1
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lgb3;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lgb3;->d:I

    .line 8
    .line 9
    xor-int/2addr p0, v0

    .line 10
    return p0
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

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lgb3;->b:Z

    .line 2
    .line 3
    iget-object v1, p0, Lgb3;->a:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lgb3;->g:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v0, "["

    .line 30
    .line 31
    const/16 v3, 0x5d

    .line 32
    .line 33
    invoke-static {v3, v0, v1}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v0, 0x3a

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lgb3;->d:I

    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
