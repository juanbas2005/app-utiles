.class public final Lr83;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lbn1;

.field public c:Ljava/lang/Object;

.field public d:Ltb7;

.field public e:Lqm5;

.field public f:Lmk1;

.field public final g:Ljava/util/List;

.field public h:Lcm7;

.field public final i:Lzy2;

.field public final j:Ljava/util/LinkedHashMap;

.field public final k:Z

.field public final l:Z

.field public final m:Lbe1;

.field public n:Lav6;

.field public o:Lwf6;

.field public p:Lin8;

.field public q:Lav6;

.field public r:Lwf6;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Lr83;->a:Landroid/content/Context;

    .line 110
    sget-object p1, Lg;->a:Lbn1;

    .line 111
    iput-object p1, p0, Lr83;->b:Lbn1;

    const/4 p1, 0x0

    .line 112
    iput-object p1, p0, Lr83;->c:Ljava/lang/Object;

    .line 113
    iput-object p1, p0, Lr83;->d:Ltb7;

    .line 114
    iput-object p1, p0, Lr83;->e:Lqm5;

    .line 115
    iput-object p1, p0, Lr83;->f:Lmk1;

    .line 116
    sget-object v0, La42;->w:La42;

    iput-object v0, p0, Lr83;->g:Ljava/util/List;

    .line 117
    iput-object p1, p0, Lr83;->h:Lcm7;

    .line 118
    iput-object p1, p0, Lr83;->i:Lzy2;

    .line 119
    iput-object p1, p0, Lr83;->j:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    .line 120
    iput-boolean v0, p0, Lr83;->k:Z

    .line 121
    iput-boolean v0, p0, Lr83;->l:Z

    .line 122
    iput-object p1, p0, Lr83;->m:Lbe1;

    .line 123
    iput-object p1, p0, Lr83;->n:Lav6;

    .line 124
    iput-object p1, p0, Lr83;->o:Lwf6;

    .line 125
    iput-object p1, p0, Lr83;->p:Lin8;

    .line 126
    iput-object p1, p0, Lr83;->q:Lav6;

    .line 127
    iput-object p1, p0, Lr83;->r:Lwf6;

    return-void
.end method

.method public constructor <init>(Ls83;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lr83;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v0, p1, Ls83;->A:Lbn1;

    .line 7
    .line 8
    iput-object v0, p0, Lr83;->b:Lbn1;

    .line 9
    .line 10
    iget-object v0, p1, Ls83;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, Lr83;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, p1, Ls83;->c:Ltb7;

    .line 15
    .line 16
    iput-object v0, p0, Lr83;->d:Ltb7;

    .line 17
    .line 18
    iget-object v0, p1, Ls83;->z:Lpo1;

    .line 19
    .line 20
    iget-object v1, v0, Lpo1;->d:Lqm5;

    .line 21
    .line 22
    iput-object v1, p0, Lr83;->e:Lqm5;

    .line 23
    .line 24
    iget-object v1, p1, Ls83;->f:Lmk1;

    .line 25
    .line 26
    iput-object v1, p0, Lr83;->f:Lmk1;

    .line 27
    .line 28
    iget-object v1, p1, Ls83;->g:Ljava/util/List;

    .line 29
    .line 30
    iput-object v1, p0, Lr83;->g:Ljava/util/List;

    .line 31
    .line 32
    iget-object v1, v0, Lpo1;->c:Lcm7;

    .line 33
    .line 34
    iput-object v1, p0, Lr83;->h:Lcm7;

    .line 35
    .line 36
    iget-object v1, p1, Ls83;->i:Lbz2;

    .line 37
    .line 38
    invoke-virtual {v1}, Lbz2;->k()Lzy2;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lr83;->i:Lzy2;

    .line 43
    .line 44
    iget-object v1, p1, Ls83;->j:Lhb7;

    .line 45
    .line 46
    iget-object v1, v1, Lhb7;->a:Ljava/util/Map;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lr83;->j:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    iget-boolean v1, p1, Ls83;->k:Z

    .line 59
    .line 60
    iput-boolean v1, p0, Lr83;->k:Z

    .line 61
    .line 62
    iget-boolean v1, p1, Ls83;->n:Z

    .line 63
    .line 64
    iput-boolean v1, p0, Lr83;->l:Z

    .line 65
    .line 66
    iget-object v1, p1, Ls83;->y:Lvc5;

    .line 67
    .line 68
    new-instance v2, Lbe1;

    .line 69
    .line 70
    invoke-direct {v2, v1}, Lbe1;-><init>(Lvc5;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, Lr83;->m:Lbe1;

    .line 74
    .line 75
    iget-object v1, v0, Lpo1;->a:Lav6;

    .line 76
    .line 77
    iput-object v1, p0, Lr83;->n:Lav6;

    .line 78
    .line 79
    iget-object v0, v0, Lpo1;->b:Lwf6;

    .line 80
    .line 81
    iput-object v0, p0, Lr83;->o:Lwf6;

    .line 82
    .line 83
    iget-object v0, p1, Ls83;->a:Landroid/content/Context;

    .line 84
    .line 85
    if-ne v0, p2, :cond_0

    .line 86
    .line 87
    iget-object p2, p1, Ls83;->v:Lin8;

    .line 88
    .line 89
    iput-object p2, p0, Lr83;->p:Lin8;

    .line 90
    .line 91
    iget-object p2, p1, Ls83;->w:Lav6;

    .line 92
    .line 93
    iput-object p2, p0, Lr83;->q:Lav6;

    .line 94
    .line 95
    iget-object p1, p1, Ls83;->x:Lwf6;

    .line 96
    .line 97
    iput-object p1, p0, Lr83;->r:Lwf6;

    .line 98
    .line 99
    return-void

    .line 100
    :cond_0
    const/4 p1, 0x0

    .line 101
    iput-object p1, p0, Lr83;->p:Lin8;

    .line 102
    .line 103
    iput-object p1, p0, Lr83;->q:Lav6;

    .line 104
    .line 105
    iput-object p1, p0, Lr83;->r:Lwf6;

    .line 106
    .line 107
    return-void
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


# virtual methods
.method public final a()Ls83;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lr83;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lme6;->H:Lme6;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, Lr83;->d:Ltb7;

    .line 11
    .line 12
    iget-object v1, v0, Lr83;->b:Lbn1;

    .line 13
    .line 14
    iget-object v6, v1, Lbn1;->g:Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    iget-object v2, v0, Lr83;->e:Lqm5;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Lbn1;->f:Lqm5;

    .line 21
    .line 22
    :cond_1
    move-object v7, v2

    .line 23
    iget-object v8, v0, Lr83;->f:Lmk1;

    .line 24
    .line 25
    iget-object v2, v0, Lr83;->h:Lcm7;

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v1, Lbn1;->e:Ll05;

    .line 30
    .line 31
    :cond_2
    move-object v10, v2

    .line 32
    iget-object v2, v0, Lr83;->i:Lzy2;

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2}, Lzy2;->a()Lbz2;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const/4 v2, 0x0

    .line 42
    :goto_0
    if-nez v2, :cond_4

    .line 43
    .line 44
    sget-object v2, Li;->c:Lbz2;

    .line 45
    .line 46
    :goto_1
    move-object v11, v2

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    sget-object v3, Li;->a:[Landroid/graphics/Bitmap$Config;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :goto_2
    iget-object v2, v0, Lr83;->j:Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    new-instance v3, Lhb7;

    .line 56
    .line 57
    invoke-static {v2}, Ltf4;->Q(Ljava/util/Map;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-direct {v3, v2}, Lhb7;-><init>(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_5
    const/4 v3, 0x0

    .line 66
    :goto_3
    if-nez v3, :cond_6

    .line 67
    .line 68
    sget-object v3, Lhb7;->b:Lhb7;

    .line 69
    .line 70
    :cond_6
    move-object v12, v3

    .line 71
    iget-object v2, v0, Lr83;->b:Lbn1;

    .line 72
    .line 73
    iget-boolean v14, v2, Lbn1;->h:Z

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, Lr83;->b:Lbn1;

    .line 79
    .line 80
    iget-object v3, v2, Lbn1;->i:Leh0;

    .line 81
    .line 82
    iget-object v9, v2, Lbn1;->j:Leh0;

    .line 83
    .line 84
    iget-object v13, v2, Lbn1;->k:Leh0;

    .line 85
    .line 86
    iget-object v15, v2, Lbn1;->a:Lh81;

    .line 87
    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    iget-object v1, v2, Lbn1;->b:Lh81;

    .line 91
    .line 92
    move-object/from16 v21, v1

    .line 93
    .line 94
    iget-object v1, v2, Lbn1;->c:Lh81;

    .line 95
    .line 96
    iget-object v2, v2, Lbn1;->d:Lh81;

    .line 97
    .line 98
    move-object/from16 v22, v1

    .line 99
    .line 100
    iget-object v1, v0, Lr83;->p:Lin8;

    .line 101
    .line 102
    move-object/from16 v17, v3

    .line 103
    .line 104
    iget-object v3, v0, Lr83;->a:Landroid/content/Context;

    .line 105
    .line 106
    move-object/from16 v23, v2

    .line 107
    .line 108
    if-nez v1, :cond_8

    .line 109
    .line 110
    move-object v1, v3

    .line 111
    :goto_4
    instance-of v2, v1, Lt54;

    .line 112
    .line 113
    if-eqz v2, :cond_7

    .line 114
    .line 115
    check-cast v1, Lt54;

    .line 116
    .line 117
    invoke-interface {v1}, Lt54;->k()Lin8;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    goto :goto_5

    .line 122
    :cond_7
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 123
    .line 124
    if-nez v2, :cond_9

    .line 125
    .line 126
    move-object/from16 v1, v16

    .line 127
    .line 128
    :goto_5
    if-nez v1, :cond_8

    .line 129
    .line 130
    sget-object v1, Lyv2;->x:Lyv2;

    .line 131
    .line 132
    :cond_8
    move-object/from16 v24, v1

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_9
    check-cast v1, Landroid/content/ContextWrapper;

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    goto :goto_4

    .line 142
    :goto_6
    iget-object v1, v0, Lr83;->n:Lav6;

    .line 143
    .line 144
    if-nez v1, :cond_b

    .line 145
    .line 146
    iget-object v2, v0, Lr83;->q:Lav6;

    .line 147
    .line 148
    if-nez v2, :cond_a

    .line 149
    .line 150
    new-instance v2, Lfw1;

    .line 151
    .line 152
    invoke-direct {v2, v3}, Lfw1;-><init>(Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    :cond_a
    move-object/from16 v25, v2

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_b
    move-object/from16 v25, v1

    .line 159
    .line 160
    :goto_7
    iget-object v2, v0, Lr83;->o:Lwf6;

    .line 161
    .line 162
    if-nez v2, :cond_d

    .line 163
    .line 164
    iget-object v2, v0, Lr83;->r:Lwf6;

    .line 165
    .line 166
    if-nez v2, :cond_d

    .line 167
    .line 168
    instance-of v2, v1, Lg68;

    .line 169
    .line 170
    if-eqz v2, :cond_c

    .line 171
    .line 172
    check-cast v1, Lg68;

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_c
    move-object/from16 v1, v16

    .line 176
    .line 177
    :goto_8
    if-nez v1, :cond_e

    .line 178
    .line 179
    sget-object v2, Lwf6;->x:Lwf6;

    .line 180
    .line 181
    :cond_d
    move-object/from16 v26, v2

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_e
    throw v16

    .line 185
    :goto_9
    iget-object v1, v0, Lr83;->m:Lbe1;

    .line 186
    .line 187
    if-eqz v1, :cond_f

    .line 188
    .line 189
    new-instance v2, Lvc5;

    .line 190
    .line 191
    iget-object v1, v1, Lbe1;->a:Ljava/util/LinkedHashMap;

    .line 192
    .line 193
    invoke-static {v1}, Ltf4;->Q(Ljava/util/Map;)Ljava/util/Map;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v2, v1}, Lvc5;-><init>(Ljava/util/Map;)V

    .line 198
    .line 199
    .line 200
    move-object v1, v2

    .line 201
    goto :goto_a

    .line 202
    :cond_f
    move-object/from16 v1, v16

    .line 203
    .line 204
    :goto_a
    if-nez v1, :cond_10

    .line 205
    .line 206
    sget-object v1, Lvc5;->x:Lvc5;

    .line 207
    .line 208
    :cond_10
    move-object/from16 v27, v1

    .line 209
    .line 210
    new-instance v1, Lpo1;

    .line 211
    .line 212
    iget-object v2, v0, Lr83;->n:Lav6;

    .line 213
    .line 214
    move-object/from16 v16, v3

    .line 215
    .line 216
    iget-object v3, v0, Lr83;->o:Lwf6;

    .line 217
    .line 218
    move-object/from16 v18, v4

    .line 219
    .line 220
    iget-object v4, v0, Lr83;->h:Lcm7;

    .line 221
    .line 222
    move-object/from16 v19, v5

    .line 223
    .line 224
    iget-object v5, v0, Lr83;->e:Lqm5;

    .line 225
    .line 226
    invoke-direct {v1, v2, v3, v4, v5}, Lpo1;-><init>(Lav6;Lwf6;Lcm7;Lqm5;)V

    .line 227
    .line 228
    .line 229
    iget-object v2, v0, Lr83;->b:Lbn1;

    .line 230
    .line 231
    move-object/from16 v29, v2

    .line 232
    .line 233
    new-instance v2, Ls83;

    .line 234
    .line 235
    move-object/from16 v4, v18

    .line 236
    .line 237
    move-object/from16 v18, v9

    .line 238
    .line 239
    iget-object v9, v0, Lr83;->g:Ljava/util/List;

    .line 240
    .line 241
    move-object/from16 v5, v19

    .line 242
    .line 243
    move-object/from16 v19, v13

    .line 244
    .line 245
    iget-boolean v13, v0, Lr83;->k:Z

    .line 246
    .line 247
    move-object/from16 v20, v15

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    iget-boolean v0, v0, Lr83;->l:Z

    .line 251
    .line 252
    move-object/from16 v28, v1

    .line 253
    .line 254
    move-object/from16 v3, v16

    .line 255
    .line 256
    move/from16 v16, v0

    .line 257
    .line 258
    invoke-direct/range {v2 .. v29}, Ls83;-><init>(Landroid/content/Context;Ljava/lang/Object;Ltb7;Landroid/graphics/Bitmap$Config;Lqm5;Lmk1;Ljava/util/List;Lcm7;Lbz2;Lhb7;ZZZZLeh0;Leh0;Leh0;Lh81;Lh81;Lh81;Lh81;Lin8;Lav6;Lwf6;Lvc5;Lpo1;Lbn1;)V

    .line 259
    .line 260
    .line 261
    return-object v2
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method
