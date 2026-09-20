.class public final Lul5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lyw1;


# static fields
.field public static final y:Ljava/util/Map;

.field public static final z:Ljava/util/List;


# instance fields
.field public final w:Lay4;

.field public final x:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "secure.etecsa.net"

    .line 16
    .line 17
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sput-object v1, Lul5;->y:Ljava/util/Map;

    .line 25
    .line 26
    new-array v1, v0, [B

    .line 27
    .line 28
    fill-array-data v1, :array_1

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-array v0, v0, [B

    .line 36
    .line 37
    fill-array-data v0, :array_2

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    filled-new-array {v1, v0}, [Ljava/net/InetAddress;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lul5;->z:Ljava/util/List;

    .line 53
    .line 54
    return-void

    .line 55
    :array_0
    .array-data 1
        0xat
        -0x4ct
        0x0t
        0x1et
    .end array-data

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    :array_1
    .array-data 1
        0x8t
        0x8t
        0x8t
        0x8t
    .end array-data

    .line 62
    .line 63
    :array_2
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method public constructor <init>(Lay4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lul5;->w:Lay4;

    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lul5;->x:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void
    .line 17
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

.method public static d(I[B)I
    .locals 1

    .line 1
    aget-byte v0, p1, p0

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    shl-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    aget-byte p0, p1, p0

    .line 10
    .line 11
    and-int/lit16 p0, p0, 0xff

    .line 12
    .line 13
    or-int/2addr p0, v0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
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
.end method

.method public static f(I[B)I
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    :goto_0
    aget-byte v1, p1, p0

    .line 3
    .line 4
    and-int/lit16 v2, v1, 0xff

    .line 5
    .line 6
    if-nez v2, :cond_1

    .line 7
    .line 8
    add-int/lit8 p0, p0, 0x1

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    return p0

    .line 14
    :cond_1
    and-int/lit16 v3, v1, 0xc0

    .line 15
    .line 16
    const/16 v4, 0xc0

    .line 17
    .line 18
    if-ne v3, v4, :cond_3

    .line 19
    .line 20
    if-gez v0, :cond_2

    .line 21
    .line 22
    add-int/lit8 v0, p0, 0x2

    .line 23
    .line 24
    :cond_2
    and-int/lit8 v1, v1, 0x3f

    .line 25
    .line 26
    shl-int/lit8 v1, v1, 0x8

    .line 27
    .line 28
    add-int/lit8 p0, p0, 0x1

    .line 29
    .line 30
    aget-byte p0, p1, p0

    .line 31
    .line 32
    and-int/lit16 p0, p0, 0xff

    .line 33
    .line 34
    or-int/2addr p0, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    add-int/2addr p0, v2

    .line 39
    goto :goto_0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lyb5;

    .line 10
    .line 11
    invoke-direct {v1, v0, p2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lul5;->x:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
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
.end method

.method public final b(Ljava/lang/String;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v1, Lul5;->y:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/util/List;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    iget-object v1, p0, Lul5;->x:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lyb5;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v3, v2, Lyb5;->w:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    iget-object v2, v2, Lyb5;->x:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    const-wide/16 v5, 0x3a98

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-wide/32 v5, 0xea60

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    sub-long/2addr v7, v3

    .line 63
    cmp-long v3, v7, v5

    .line 64
    .line 65
    if-gez v3, :cond_2

    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_2
    iget-object v2, p0, Lul5;->w:Lay4;

    .line 69
    .line 70
    iget-object v3, v2, Lay4;->x:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Landroid/net/ConnectivityManager;

    .line 73
    .line 74
    sget-object v4, La42;->w:La42;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    if-nez v3, :cond_3

    .line 78
    .line 79
    :goto_1
    move-object v6, v4

    .line 80
    goto :goto_5

    .line 81
    :cond_3
    invoke-virtual {v2}, Lay4;->j()Landroid/net/Network;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-nez v6, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    :try_start_0
    invoke-virtual {v3, v6}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-virtual {v3}, Landroid/net/LinkProperties;->getDnsServers()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v3

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    move-object v3, v5

    .line 102
    goto :goto_3

    .line 103
    :goto_2
    new-instance v6, Lm66;

    .line 104
    .line 105
    invoke-direct {v6, v3}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    move-object v3, v6

    .line 109
    :goto_3
    nop

    .line 110
    instance-of v6, v3, Lm66;

    .line 111
    .line 112
    if-eqz v6, :cond_6

    .line 113
    .line 114
    move-object v3, v5

    .line 115
    :cond_6
    check-cast v3, Ljava/util/List;

    .line 116
    .line 117
    if-nez v3, :cond_7

    .line 118
    .line 119
    move-object v3, v4

    .line 120
    :cond_7
    new-instance v6, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_8
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_9

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    instance-of v8, v7, Ljava/net/InetAddress;

    .line 140
    .line 141
    if-eqz v8, :cond_8

    .line 142
    .line 143
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_9
    :goto_5
    invoke-virtual {p0, p1, v6}, Lul5;->e(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-nez v6, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0, v0, v3}, Lul5;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :cond_a
    sget-object v3, Lul5;->z:Ljava/util/List;

    .line 162
    .line 163
    invoke-virtual {p0, p1, v3}, Lul5;->e(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_b

    .line 172
    .line 173
    invoke-virtual {p0, v0, v3}, Lul5;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    return-object v3

    .line 177
    :cond_b
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 178
    .line 179
    const/16 v6, 0x1c

    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    if-ge v3, v6, :cond_c

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_c
    iget-object v3, v2, Lay4;->x:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v3, Landroid/net/ConnectivityManager;

    .line 188
    .line 189
    if-nez v3, :cond_d

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_d
    invoke-virtual {v2}, Lay4;->j()Landroid/net/Network;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-nez v2, :cond_e

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_e
    :try_start_1
    invoke-virtual {v3, v2}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-eqz v2, :cond_f

    .line 204
    .line 205
    invoke-static {v2}, Ltj5;->x(Landroid/net/LinkProperties;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    goto :goto_7

    .line 214
    :catchall_1
    move-exception v2

    .line 215
    goto :goto_6

    .line 216
    :cond_f
    move-object v2, v5

    .line 217
    goto :goto_7

    .line 218
    :goto_6
    new-instance v3, Lm66;

    .line 219
    .line 220
    invoke-direct {v3, v2}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    move-object v2, v3

    .line 224
    :goto_7
    nop

    .line 225
    instance-of v3, v2, Lm66;

    .line 226
    .line 227
    if-eqz v3, :cond_10

    .line 228
    .line 229
    move-object v2, v5

    .line 230
    :cond_10
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-static {v2, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    :goto_8
    if-nez v7, :cond_16

    .line 237
    .line 238
    :try_start_2
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {v2}, Lqs;->p1([Ljava/lang/Object;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 249
    goto :goto_b

    .line 250
    :catch_0
    move-exception v2

    .line 251
    goto :goto_9

    .line 252
    :catchall_2
    move-exception p1

    .line 253
    goto :goto_a

    .line 254
    :goto_9
    :try_start_3
    new-instance v3, Ljava/net/UnknownHostException;

    .line 255
    .line 256
    const-string v6, "Broken system behaviour for dns lookup of "

    .line 257
    .line 258
    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-direct {v3, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 266
    .line 267
    .line 268
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 269
    :goto_a
    new-instance v2, Lm66;

    .line 270
    .line 271
    invoke-direct {v2, p1}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    move-object p1, v2

    .line 275
    :goto_b
    nop

    .line 276
    instance-of v2, p1, Lm66;

    .line 277
    .line 278
    if-eqz v2, :cond_11

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_11
    move-object v5, p1

    .line 282
    :goto_c
    check-cast v5, Ljava/util/List;

    .line 283
    .line 284
    if-nez v5, :cond_12

    .line 285
    .line 286
    move-object v5, v4

    .line 287
    :cond_12
    new-instance p1, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    :cond_13
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_15

    .line 301
    .line 302
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    move-object v5, v3

    .line 307
    check-cast v5, Ljava/net/InetAddress;

    .line 308
    .line 309
    invoke-virtual {v5}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-nez v6, :cond_13

    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-eqz v5, :cond_14

    .line 320
    .line 321
    goto :goto_d

    .line 322
    :cond_14
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_d

    .line 326
    :cond_15
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-nez v2, :cond_16

    .line 331
    .line 332
    invoke-virtual {p0, v0, p1}, Lul5;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 333
    .line 334
    .line 335
    return-object p1

    .line 336
    :cond_16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 337
    .line 338
    .line 339
    move-result-wide p0

    .line 340
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    new-instance p1, Lyb5;

    .line 345
    .line 346
    invoke-direct {p1, p0, v4}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    return-object v4
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final c(Ljava/net/InetAddress;Ljava/lang/String;)Ljava/util/List;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x2e

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    invoke-static {p2, v1}, Ld57;->l1(Ljava/lang/String;[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string v1, "."

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v3, 0x6

    .line 20
    invoke-static {p2, v1, v3}, Ld57;->W0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move v4, v2

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    add-int/2addr v5, v0

    .line 46
    add-int/2addr v4, v5

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    add-int/lit8 v1, v4, 0x1

    .line 49
    .line 50
    new-array v6, v1, [B

    .line 51
    .line 52
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    move v1, v2

    .line 57
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    move-object v11, v5

    .line 68
    check-cast v11, Ljava/lang/String;

    .line 69
    .line 70
    add-int/lit8 v7, v1, 0x1

    .line 71
    .line 72
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    int-to-byte v5, v5

    .line 77
    aput-byte v5, v6, v1

    .line 78
    .line 79
    sget-object v1, Lmo0;->d:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    invoke-virtual {v11, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    const/16 v10, 0xc

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    invoke-static/range {v5 .. v10}, Lqs;->O0([B[BIIII)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    add-int/2addr v1, v7

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    aput-byte v2, v6, v1

    .line 102
    .line 103
    sget-object p2, Lwv5;->a:Lp2;

    .line 104
    .line 105
    invoke-virtual {p2}, Lp2;->f()Ljava/util/Random;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const/high16 v1, 0x10000

    .line 110
    .line 111
    invoke-virtual {p2, v1}, Ljava/util/Random;->nextInt(I)I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    add-int/lit8 v4, v4, 0x11

    .line 116
    .line 117
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    int-to-short v4, p2

    .line 122
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    const/16 v4, 0x100

    .line 126
    .line 127
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    .line 151
    new-instance v4, Ljava/net/DatagramSocket;

    .line 152
    .line 153
    invoke-direct {v4}, Ljava/net/DatagramSocket;-><init>()V

    .line 154
    .line 155
    .line 156
    :try_start_0
    iget-object p0, p0, Lul5;->w:Lay4;

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lay4;->j()Landroid/net/Network;

    .line 162
    .line 163
    .line 164
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 165
    if-nez p0, :cond_2

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    :try_start_1
    invoke-virtual {p0, v4}, Landroid/net/Network;->bindSocket(Ljava/net/DatagramSocket;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    .line 170
    .line 171
    :catchall_0
    :goto_2
    const/16 p0, 0x7d0

    .line 172
    .line 173
    :try_start_2
    invoke-virtual {v4, p0}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    .line 174
    .line 175
    .line 176
    new-instance p0, Ljava/net/DatagramPacket;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    new-instance v6, Ljava/net/InetSocketAddress;

    .line 187
    .line 188
    const/16 v7, 0x35

    .line 189
    .line 190
    invoke-direct {v6, p1, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 191
    .line 192
    .line 193
    invoke-direct {p0, v5, v1, v6}, Ljava/net/DatagramPacket;-><init>([BILjava/net/SocketAddress;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, p0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 197
    .line 198
    .line 199
    const/16 p0, 0x200

    .line 200
    .line 201
    new-array p1, p0, [B

    .line 202
    .line 203
    new-instance v1, Ljava/net/DatagramPacket;

    .line 204
    .line 205
    invoke-direct {v1, p1, p0}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    sget-object v1, La42;->w:La42;

    .line 216
    .line 217
    const/16 v5, 0xc

    .line 218
    .line 219
    if-ge p0, v5, :cond_3

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_3
    invoke-static {v2, p1}, Lul5;->d(I[B)I

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eq p0, p2, :cond_4

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_4
    const/4 p0, 0x2

    .line 230
    invoke-static {p0, p1}, Lul5;->d(I[B)I

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    and-int/lit8 p0, p0, 0xf

    .line 235
    .line 236
    if-eqz p0, :cond_5

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_5
    const/4 p0, 0x4

    .line 240
    invoke-static {p0, p1}, Lul5;->d(I[B)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    invoke-static {v3, p1}, Lul5;->d(I[B)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    move v3, v2

    .line 249
    :goto_3
    if-ge v3, p2, :cond_6

    .line 250
    .line 251
    invoke-static {v5, p1}, Lul5;->f(I[B)I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    add-int/2addr v5, p0

    .line 256
    add-int/lit8 v3, v3, 0x1

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    :goto_4
    if-ge v2, v1, :cond_8

    .line 265
    .line 266
    invoke-static {v5, p1}, Lul5;->f(I[B)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    invoke-static {v3, p1}, Lul5;->d(I[B)I

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    add-int/lit8 v6, v3, 0x8

    .line 275
    .line 276
    invoke-static {v6, p1}, Lul5;->d(I[B)I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-ne v5, v0, :cond_7

    .line 281
    .line 282
    if-ne v6, p0, :cond_7

    .line 283
    .line 284
    add-int/lit8 v5, v3, 0xa

    .line 285
    .line 286
    add-int/lit8 v7, v3, 0xe

    .line 287
    .line 288
    invoke-static {p1, v5, v7}, Lqs;->P0([BII)[B

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-static {v5}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 297
    .line 298
    .line 299
    :cond_7
    add-int/lit8 v6, v6, 0xa

    .line 300
    .line 301
    add-int v5, v6, v3

    .line 302
    .line 303
    add-int/lit8 v2, v2, 0x1

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    move-object v1, p2

    .line 307
    :goto_5
    invoke-virtual {v4}, Ljava/net/DatagramSocket;->close()V

    .line 308
    .line 309
    .line 310
    return-object v1

    .line 311
    :catchall_1
    move-exception v0

    .line 312
    move-object p0, v0

    .line 313
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 314
    :catchall_2
    move-exception v0

    .line 315
    move-object p1, v0

    .line 316
    invoke-static {v4, p0}, Led1;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 317
    .line 318
    .line 319
    throw p1
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final e(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/net/InetAddress;

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lul5;->c(Ljava/net/InetAddress;Ljava/lang/String;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    new-instance v1, Lm66;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :goto_1
    nop

    .line 30
    instance-of v1, v0, Lm66;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    sget-object p0, La42;->w:La42;

    .line 48
    .line 49
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
