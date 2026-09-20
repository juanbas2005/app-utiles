.class public final Ly86;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lgq3;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Lc9;

.field public i:Z

.field public final j:Lz86;

.field public final k:J

.field public final l:Lld4;

.field public final m:Ljava/util/LinkedHashSet;

.field public final n:Ljava/util/LinkedHashSet;

.field public final o:Ljava/util/ArrayList;

.field public p:Z

.field public q:Z

.field public r:Z

.field public final s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly86;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ly86;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    sget-object v0, Lz86;->w:Lz86;

    .line 19
    .line 20
    iput-object v0, p0, Ly86;->j:Lz86;

    .line 21
    .line 22
    const-wide/16 v0, -0x1

    .line 23
    .line 24
    iput-wide v0, p0, Ly86;->k:J

    .line 25
    .line 26
    new-instance v0, Lld4;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, v1}, Lld4;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ly86;->l:Lld4;

    .line 33
    .line 34
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Ly86;->m:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Ly86;->n:Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Ly86;->o:Ljava/util/ArrayList;

    .line 54
    .line 55
    iput-boolean v1, p0, Ly86;->p:Z

    .line 56
    .line 57
    iput-boolean v1, p0, Ly86;->s:Z

    .line 58
    .line 59
    sget-object v0, Lb26;->a:Lc26;

    .line 60
    .line 61
    invoke-virtual {v0, p2}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iput-object p2, p0, Ly86;->a:Lgq3;

    .line 66
    .line 67
    iput-object p1, p0, Ly86;->b:Landroid/content/Context;

    .line 68
    .line 69
    iput-object p3, p0, Ly86;->c:Ljava/lang/String;

    .line 70
    .line 71
    return-void
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


# virtual methods
.method public final varargs a([Lvk4;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    iget v4, v3, Lvk4;->a:I

    .line 9
    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-object v5, p0, Ly86;->n:Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget v3, v3, Lvk4;->b:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length v0, p1

    .line 32
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, [Lvk4;

    .line 37
    .line 38
    iget-object p0, p0, Ly86;->l:Lld4;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    array-length v0, p1

    .line 44
    :goto_1
    if-ge v1, v0, :cond_1

    .line 45
    .line 46
    aget-object v2, p1, v1

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lld4;->a(Lvk4;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    return-void
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

.method public final b()La96;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly86;->f:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Ly86;->g:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    sget-object v1, Lpr;->e:Lor;

    .line 12
    .line 13
    iput-object v1, v0, Ly86;->g:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    iput-object v1, v0, Ly86;->f:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v2, v0, Ly86;->g:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iput-object v1, v0, Ly86;->g:Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, v0, Ly86;->g:Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    iput-object v1, v0, Ly86;->f:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    :cond_2
    :goto_0
    iget-object v1, v0, Ly86;->n:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v15, v0, Ly86;->m:Ljava/util/LinkedHashSet;

    .line 39
    .line 40
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x0

    .line 48
    if-nez v2, :cond_4

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-interface {v15, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const-string v0, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "

    .line 82
    .line 83
    invoke-static {v2, v0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_4
    iget-object v1, v0, Ly86;->h:Lc9;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    new-instance v1, Lor2;

    .line 97
    .line 98
    invoke-direct {v1, v2}, Lor2;-><init>(I)V

    .line 99
    .line 100
    .line 101
    :cond_5
    move-object v5, v1

    .line 102
    iget-wide v6, v0, Ly86;->k:J

    .line 103
    .line 104
    const-wide/16 v8, 0x0

    .line 105
    .line 106
    cmp-long v1, v6, v8

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    if-lez v1, :cond_6

    .line 110
    .line 111
    move v1, v4

    .line 112
    goto :goto_2

    .line 113
    :cond_6
    move v1, v2

    .line 114
    :goto_2
    const-string v6, "Required value was null."

    .line 115
    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    iget-object v0, v0, Ly86;->c:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    invoke-static {v6}, Lh;->q(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v3

    .line 126
    :cond_7
    const-string v0, "Cannot create auto-closing database for an in-memory database."

    .line 127
    .line 128
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v3

    .line 132
    :cond_8
    move v1, v2

    .line 133
    new-instance v2, Lmf1;

    .line 134
    .line 135
    iget-boolean v8, v0, Ly86;->i:Z

    .line 136
    .line 137
    iget-object v7, v0, Ly86;->j:Lz86;

    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-object v9, v3

    .line 143
    iget-object v3, v0, Ly86;->b:Landroid/content/Context;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    sget-object v10, Lz86;->w:Lz86;

    .line 149
    .line 150
    if-eq v7, v10, :cond_9

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_9
    const-string v7, "activity"

    .line 154
    .line 155
    invoke-virtual {v3, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    instance-of v10, v7, Landroid/app/ActivityManager;

    .line 160
    .line 161
    if-eqz v10, :cond_a

    .line 162
    .line 163
    check-cast v7, Landroid/app/ActivityManager;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_a
    move-object v7, v9

    .line 167
    :goto_3
    if-eqz v7, :cond_b

    .line 168
    .line 169
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-nez v7, :cond_b

    .line 174
    .line 175
    sget-object v7, Lz86;->y:Lz86;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_b
    sget-object v7, Lz86;->x:Lz86;

    .line 179
    .line 180
    :goto_4
    iget-object v10, v0, Ly86;->f:Ljava/util/concurrent/Executor;

    .line 181
    .line 182
    if-eqz v10, :cond_31

    .line 183
    .line 184
    iget-object v11, v0, Ly86;->g:Ljava/util/concurrent/Executor;

    .line 185
    .line 186
    if-eqz v11, :cond_30

    .line 187
    .line 188
    iget-boolean v13, v0, Ly86;->p:Z

    .line 189
    .line 190
    iget-boolean v14, v0, Ly86;->q:Z

    .line 191
    .line 192
    iget-boolean v6, v0, Ly86;->r:Z

    .line 193
    .line 194
    const/16 v22, 0x0

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    move v12, v4

    .line 199
    iget-object v4, v0, Ly86;->c:Ljava/lang/String;

    .line 200
    .line 201
    move/from16 v21, v6

    .line 202
    .line 203
    iget-object v6, v0, Ly86;->l:Lld4;

    .line 204
    .line 205
    move-object/from16 v16, v9

    .line 206
    .line 207
    move-object v9, v7

    .line 208
    iget-object v7, v0, Ly86;->d:Ljava/util/ArrayList;

    .line 209
    .line 210
    move/from16 v17, v12

    .line 211
    .line 212
    move-object/from16 v18, v16

    .line 213
    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    move/from16 v19, v17

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    move-object/from16 v20, v18

    .line 221
    .line 222
    const/16 v18, 0x0

    .line 223
    .line 224
    iget-object v1, v0, Ly86;->e:Ljava/util/ArrayList;

    .line 225
    .line 226
    iget-object v12, v0, Ly86;->o:Ljava/util/ArrayList;

    .line 227
    .line 228
    move/from16 v20, v19

    .line 229
    .line 230
    move-object/from16 v19, v1

    .line 231
    .line 232
    move/from16 v1, v20

    .line 233
    .line 234
    move-object/from16 v20, v12

    .line 235
    .line 236
    const/4 v12, 0x0

    .line 237
    invoke-direct/range {v2 .. v23}, Lmf1;-><init>(Landroid/content/Context;Ljava/lang/String;Li87;Lld4;Ljava/util/List;ZLz86;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLva6;Le81;)V

    .line 238
    .line 239
    .line 240
    iget-boolean v3, v0, Ly86;->s:Z

    .line 241
    .line 242
    iput-boolean v3, v2, Lmf1;->q:Z

    .line 243
    .line 244
    iget-object v0, v0, Ly86;->a:Lgq3;

    .line 245
    .line 246
    invoke-static {v0}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v3}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_c

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_d

    .line 261
    .line 262
    :cond_c
    const-string v0, ""

    .line 263
    .line 264
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    if-nez v5, :cond_e

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    add-int/2addr v5, v1

    .line 283
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    :goto_5
    const/16 v5, 0x5f

    .line 288
    .line 289
    const/16 v6, 0x2e

    .line 290
    .line 291
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    const-string v5, "_Impl"

    .line 299
    .line 300
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-nez v5, :cond_f

    .line 309
    .line 310
    move-object v0, v4

    .line 311
    goto :goto_6

    .line 312
    :cond_f
    new-instance v5, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-static {v0, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const/4 v9, 0x0

    .line 342
    invoke-virtual {v0, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 350
    move-object v12, v0

    .line 351
    check-cast v12, La96;

    .line 352
    .line 353
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-boolean v0, v2, Lmf1;->q:Z

    .line 357
    .line 358
    iput-boolean v0, v12, La96;->k:Z

    .line 359
    .line 360
    :try_start_1
    invoke-virtual {v12}, La96;->e()Lt22;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ls05; {:try_start_1 .. :try_end_1} :catch_0

    .line 365
    .line 366
    .line 367
    goto :goto_7

    .line 368
    :catch_0
    const/4 v3, 0x0

    .line 369
    :goto_7
    if-eqz v3, :cond_2f

    .line 370
    .line 371
    new-instance v0, Ldq1;

    .line 372
    .line 373
    new-instance v10, Lyv;

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const/16 v18, 0xc

    .line 378
    .line 379
    const/4 v11, 0x2

    .line 380
    const-class v13, Lb96;

    .line 381
    .line 382
    const-string v14, "compatTransactionCoroutineExecute"

    .line 383
    .line 384
    const-string v15, "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 385
    .line 386
    const/16 v16, 0x1

    .line 387
    .line 388
    invoke-direct/range {v10 .. v18}, Lyv;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 389
    .line 390
    .line 391
    invoke-direct {v0, v2, v3, v10}, Ldq1;-><init>(Lmf1;Lt22;Lyv;)V

    .line 392
    .line 393
    .line 394
    iput-object v0, v12, La96;->e:Ldq1;

    .line 395
    .line 396
    invoke-virtual {v12}, La96;->d()Leh3;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iput-object v0, v12, La96;->f:Leh3;

    .line 401
    .line 402
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 403
    .line 404
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, La96;->i()Ljava/util/Set;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    iget-object v4, v2, Lmf1;->n:Ljava/util/List;

    .line 412
    .line 413
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    new-array v6, v5, [Z

    .line 418
    .line 419
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    const/4 v8, -0x1

    .line 428
    if-eqz v7, :cond_14

    .line 429
    .line 430
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    check-cast v7, Lgq3;

    .line 435
    .line 436
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    add-int/2addr v9, v8

    .line 441
    if-ltz v9, :cond_12

    .line 442
    .line 443
    :goto_9
    add-int/lit8 v10, v9, -0x1

    .line 444
    .line 445
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v11

    .line 449
    invoke-interface {v7, v11}, Lgq3;->L(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    if-eqz v11, :cond_10

    .line 454
    .line 455
    aput-boolean v1, v6, v9

    .line 456
    .line 457
    move v8, v9

    .line 458
    goto :goto_a

    .line 459
    :cond_10
    if-gez v10, :cond_11

    .line 460
    .line 461
    goto :goto_a

    .line 462
    :cond_11
    move v9, v10

    .line 463
    goto :goto_9

    .line 464
    :cond_12
    :goto_a
    if-ltz v8, :cond_13

    .line 465
    .line 466
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_13
    invoke-interface {v7}, Lgq3;->l()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    const-string v1, ") is missing in the database configuration."

    .line 479
    .line 480
    const-string v2, "A required auto migration spec ("

    .line 481
    .line 482
    invoke-static {v0, v1, v2}, Lku4;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    const/16 v24, 0x0

    .line 486
    .line 487
    return-object v24

    .line 488
    :cond_14
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    add-int/2addr v3, v8

    .line 493
    if-ltz v3, :cond_17

    .line 494
    .line 495
    :goto_b
    add-int/lit8 v4, v3, -0x1

    .line 496
    .line 497
    if-ge v3, v5, :cond_16

    .line 498
    .line 499
    aget-boolean v3, v6, v3

    .line 500
    .line 501
    if-eqz v3, :cond_16

    .line 502
    .line 503
    if-gez v4, :cond_15

    .line 504
    .line 505
    goto :goto_c

    .line 506
    :cond_15
    move v3, v4

    .line 507
    goto :goto_b

    .line 508
    :cond_16
    const-string v0, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    .line 509
    .line 510
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    const/16 v24, 0x0

    .line 514
    .line 515
    return-object v24

    .line 516
    :cond_17
    :goto_c
    invoke-virtual {v12, v0}, La96;->c(Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    :cond_18
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    if-eqz v3, :cond_1b

    .line 529
    .line 530
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    check-cast v3, Lvk4;

    .line 535
    .line 536
    iget v4, v3, Lvk4;->a:I

    .line 537
    .line 538
    iget v5, v3, Lvk4;->b:I

    .line 539
    .line 540
    iget-object v6, v2, Lmf1;->d:Lld4;

    .line 541
    .line 542
    iget-object v7, v6, Lld4;->a:Ljava/util/LinkedHashMap;

    .line 543
    .line 544
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-interface {v7, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v9

    .line 552
    if-eqz v9, :cond_1a

    .line 553
    .line 554
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v7, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    check-cast v4, Ljava/util/Map;

    .line 563
    .line 564
    if-nez v4, :cond_19

    .line 565
    .line 566
    sget-object v4, Lb42;->w:Lb42;

    .line 567
    .line 568
    :cond_19
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v4

    .line 576
    goto :goto_e

    .line 577
    :cond_1a
    const/4 v4, 0x0

    .line 578
    :goto_e
    if-nez v4, :cond_18

    .line 579
    .line 580
    invoke-virtual {v6, v3}, Lld4;->a(Lvk4;)V

    .line 581
    .line 582
    .line 583
    goto :goto_d

    .line 584
    :cond_1b
    invoke-virtual {v12}, La96;->j()Ljava/util/LinkedHashMap;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    iget-object v3, v2, Lmf1;->m:Ljava/util/List;

    .line 589
    .line 590
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    new-array v4, v4, [Z

    .line 595
    .line 596
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    if-eqz v5, :cond_21

    .line 609
    .line 610
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    check-cast v5, Ljava/util/Map$Entry;

    .line 615
    .line 616
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    check-cast v6, Lgq3;

    .line 621
    .line 622
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    check-cast v5, Ljava/util/List;

    .line 627
    .line 628
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v7

    .line 636
    if-eqz v7, :cond_1c

    .line 637
    .line 638
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v7

    .line 642
    check-cast v7, Lgq3;

    .line 643
    .line 644
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    add-int/2addr v9, v8

    .line 649
    if-ltz v9, :cond_1f

    .line 650
    .line 651
    :goto_10
    add-int/lit8 v10, v9, -0x1

    .line 652
    .line 653
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v11

    .line 657
    invoke-interface {v7, v11}, Lgq3;->L(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v11

    .line 661
    if-eqz v11, :cond_1d

    .line 662
    .line 663
    aput-boolean v1, v4, v9

    .line 664
    .line 665
    goto :goto_12

    .line 666
    :cond_1d
    if-gez v10, :cond_1e

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :cond_1e
    move v9, v10

    .line 670
    goto :goto_10

    .line 671
    :cond_1f
    :goto_11
    move v9, v8

    .line 672
    :goto_12
    if-ltz v9, :cond_20

    .line 673
    .line 674
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v9

    .line 678
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    iget-object v10, v12, La96;->j:Ljava/util/LinkedHashMap;

    .line 685
    .line 686
    invoke-interface {v10, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    goto :goto_f

    .line 690
    :cond_20
    invoke-interface {v7}, Lgq3;->l()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-interface {v6}, Lgq3;->l()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    const-string v2, " is missing in the database configuration."

    .line 699
    .line 700
    const-string v3, "A required type converter ("

    .line 701
    .line 702
    const-string v4, ") for "

    .line 703
    .line 704
    invoke-static {v3, v0, v4, v1, v2}, Lku4;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    const/16 v24, 0x0

    .line 708
    .line 709
    return-object v24

    .line 710
    :cond_21
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    add-int/2addr v0, v8

    .line 715
    if-ltz v0, :cond_24

    .line 716
    .line 717
    :goto_13
    add-int/lit8 v5, v0, -0x1

    .line 718
    .line 719
    aget-boolean v6, v4, v0

    .line 720
    .line 721
    if-eqz v6, :cond_23

    .line 722
    .line 723
    if-gez v5, :cond_22

    .line 724
    .line 725
    goto :goto_14

    .line 726
    :cond_22
    move v0, v5

    .line 727
    goto :goto_13

    .line 728
    :cond_23
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    const-string v1, "Unexpected type converter "

    .line 733
    .line 734
    const-string v2, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    .line 735
    .line 736
    invoke-static {v0, v2, v1}, Lrf2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    const/16 v24, 0x0

    .line 740
    .line 741
    return-object v24

    .line 742
    :cond_24
    :goto_14
    iget-object v0, v2, Lmf1;->h:Ljava/util/concurrent/Executor;

    .line 743
    .line 744
    iput-object v0, v12, La96;->c:Ljava/util/concurrent/Executor;

    .line 745
    .line 746
    new-instance v0, Lol6;

    .line 747
    .line 748
    iget-object v3, v2, Lmf1;->i:Ljava/util/concurrent/Executor;

    .line 749
    .line 750
    invoke-direct {v0, v3, v1}, Lol6;-><init>(Ljava/util/concurrent/Executor;I)V

    .line 751
    .line 752
    .line 753
    iput-object v0, v12, La96;->d:Lol6;

    .line 754
    .line 755
    iget-object v0, v12, La96;->c:Ljava/util/concurrent/Executor;

    .line 756
    .line 757
    if-eqz v0, :cond_2e

    .line 758
    .line 759
    invoke-static {v0}, Lwe;->l(Ljava/util/concurrent/Executor;)Lh81;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {}, Lb85;->d()Lw77;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-static {v0, v1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    iput-object v0, v12, La96;->a:Lig0;

    .line 776
    .line 777
    iget-object v0, v0, Lig0;->x:Le81;

    .line 778
    .line 779
    iget-object v1, v12, La96;->d:Lol6;

    .line 780
    .line 781
    if-eqz v1, :cond_2d

    .line 782
    .line 783
    invoke-static {v1}, Lwe;->l(Ljava/util/concurrent/Executor;)Lh81;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    invoke-interface {v0, v1}, Le81;->X(Le81;)Le81;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    iput-object v0, v12, La96;->b:Le81;

    .line 792
    .line 793
    iget-boolean v0, v2, Lmf1;->f:Z

    .line 794
    .line 795
    iput-boolean v0, v12, La96;->h:Z

    .line 796
    .line 797
    iget-object v0, v12, La96;->e:Ldq1;

    .line 798
    .line 799
    const-string v1, "connectionManager"

    .line 800
    .line 801
    if-eqz v0, :cond_2c

    .line 802
    .line 803
    iget-object v0, v0, Ldq1;->h:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v0, Lj87;

    .line 806
    .line 807
    if-nez v0, :cond_26

    .line 808
    .line 809
    :cond_25
    const/4 v3, 0x0

    .line 810
    goto :goto_16

    .line 811
    :cond_26
    move-object v3, v0

    .line 812
    :goto_15
    nop

    .line 813
    instance-of v0, v3, Lmm5;

    .line 814
    .line 815
    if-eqz v0, :cond_27

    .line 816
    .line 817
    goto :goto_16

    .line 818
    :cond_27
    instance-of v0, v3, Lxo1;

    .line 819
    .line 820
    if-eqz v0, :cond_25

    .line 821
    .line 822
    check-cast v3, Lxo1;

    .line 823
    .line 824
    invoke-interface {v3}, Lxo1;->a()Lj87;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    goto :goto_15

    .line 829
    :goto_16
    check-cast v3, Lmm5;

    .line 830
    .line 831
    iget-object v0, v12, La96;->e:Ldq1;

    .line 832
    .line 833
    if-eqz v0, :cond_2b

    .line 834
    .line 835
    iget-object v0, v0, Ldq1;->h:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v0, Lj87;

    .line 838
    .line 839
    if-nez v0, :cond_29

    .line 840
    .line 841
    :cond_28
    const/4 v3, 0x0

    .line 842
    goto :goto_18

    .line 843
    :cond_29
    move-object v3, v0

    .line 844
    :goto_17
    nop

    .line 845
    instance-of v0, v3, Lxw;

    .line 846
    .line 847
    if-eqz v0, :cond_2a

    .line 848
    .line 849
    goto :goto_18

    .line 850
    :cond_2a
    instance-of v0, v3, Lxo1;

    .line 851
    .line 852
    if-eqz v0, :cond_28

    .line 853
    .line 854
    check-cast v3, Lxo1;

    .line 855
    .line 856
    invoke-interface {v3}, Lxo1;->a()Lj87;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    goto :goto_17

    .line 861
    :goto_18
    check-cast v3, Lxw;

    .line 862
    .line 863
    return-object v12

    .line 864
    :cond_2b
    invoke-static {v1}, Lsg3;->a0(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    const/16 v24, 0x0

    .line 868
    .line 869
    throw v24

    .line 870
    :cond_2c
    const/16 v24, 0x0

    .line 871
    .line 872
    invoke-static {v1}, Lsg3;->a0(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    throw v24

    .line 876
    :cond_2d
    const/16 v24, 0x0

    .line 877
    .line 878
    const-string v0, "internalTransactionExecutor"

    .line 879
    .line 880
    invoke-static {v0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    throw v24

    .line 884
    :cond_2e
    const/16 v24, 0x0

    .line 885
    .line 886
    const-string v0, "internalQueryExecutor"

    .line 887
    .line 888
    invoke-static {v0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    throw v24

    .line 892
    :cond_2f
    new-instance v0, Ldq1;

    .line 893
    .line 894
    new-instance v1, Lb86;

    .line 895
    .line 896
    invoke-direct {v1, v12}, Lb86;-><init>(La96;)V

    .line 897
    .line 898
    .line 899
    new-instance v10, Lyv;

    .line 900
    .line 901
    const/16 v17, 0x0

    .line 902
    .line 903
    const/16 v18, 0xb

    .line 904
    .line 905
    const/4 v11, 0x2

    .line 906
    const-class v13, Lb96;

    .line 907
    .line 908
    const-string v14, "compatTransactionCoroutineExecute"

    .line 909
    .line 910
    const-string v15, "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 911
    .line 912
    const/16 v16, 0x1

    .line 913
    .line 914
    invoke-direct/range {v10 .. v18}, Lyv;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 915
    .line 916
    .line 917
    invoke-direct {v0, v2, v1, v10}, Ldq1;-><init>(Lmf1;Lb86;Lyv;)V

    .line 918
    .line 919
    .line 920
    const/16 v24, 0x0

    .line 921
    .line 922
    throw v24

    .line 923
    :catch_1
    move-exception v0

    .line 924
    goto :goto_19

    .line 925
    :catch_2
    move-exception v0

    .line 926
    goto :goto_1a

    .line 927
    :catch_3
    move-exception v0

    .line 928
    goto :goto_1b

    .line 929
    :goto_19
    new-instance v1, Ljava/lang/RuntimeException;

    .line 930
    .line 931
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    new-instance v3, Ljava/lang/StringBuilder;

    .line 936
    .line 937
    const-string v4, "Failed to create an instance of "

    .line 938
    .line 939
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 950
    .line 951
    .line 952
    throw v1

    .line 953
    :goto_1a
    new-instance v1, Ljava/lang/RuntimeException;

    .line 954
    .line 955
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    new-instance v3, Ljava/lang/StringBuilder;

    .line 960
    .line 961
    const-string v4, "Cannot access the constructor "

    .line 962
    .line 963
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 974
    .line 975
    .line 976
    throw v1

    .line 977
    :goto_1b
    new-instance v1, Ljava/lang/RuntimeException;

    .line 978
    .line 979
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    new-instance v3, Ljava/lang/StringBuilder;

    .line 984
    .line 985
    const-string v5, "Cannot find implementation for "

    .line 986
    .line 987
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    const-string v2, ". "

    .line 994
    .line 995
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    const-string v2, " does not exist. Is Room annotation processor correctly configured?"

    .line 1002
    .line 1003
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v2

    .line 1010
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1011
    .line 1012
    .line 1013
    throw v1

    .line 1014
    :cond_30
    invoke-static {v6}, Lh;->q(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    const/16 v24, 0x0

    .line 1018
    .line 1019
    return-object v24

    .line 1020
    :cond_31
    move-object/from16 v24, v9

    .line 1021
    .line 1022
    invoke-static {v6}, Lh;->q(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    return-object v24
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method
