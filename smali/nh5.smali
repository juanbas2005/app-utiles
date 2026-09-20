.class public final Lnh5;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:J

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Ljava/io/Serializable;

.field public E:Ljava/lang/Object;

.field public F:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

.field public G:I

.field public H:I

.field public I:I

.field public final synthetic J:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;


# direct methods
.method public constructor <init>(Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnh5;->J:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo81;

    .line 2
    .line 3
    check-cast p2, Lf61;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lnh5;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnh5;

    .line 10
    .line 11
    sget-object p1, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lnh5;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

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

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 0

    .line 1
    new-instance p2, Lnh5;

    .line 2
    .line 3
    iget-object p0, p0, Lnh5;->J:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 4
    .line 5
    invoke-direct {p2, p0, p1}, Lnh5;-><init>(Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;Lf61;)V

    .line 6
    .line 7
    .line 8
    return-object p2
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

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnh5;->J:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 4
    .line 5
    iget-object v2, v1, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;->j:Ldv7;

    .line 6
    .line 7
    iget-object v3, v1, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;->g:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v4, v1, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;->i:Lk40;

    .line 10
    .line 11
    iget v5, v0, Lnh5;->I:I

    .line 12
    .line 13
    const-string v6, "--"

    .line 14
    .line 15
    const-string v12, ":::"

    .line 16
    .line 17
    const/4 v15, 0x0

    .line 18
    sget-object v9, Lp81;->w:Lp81;

    .line 19
    .line 20
    packed-switch v5, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v15

    .line 29
    :pswitch_0
    iget-object v1, v0, Lnh5;->F:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    iget-object v1, v0, Lnh5;->E:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/util/List;

    .line 36
    .line 37
    iget-object v1, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 38
    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    iget-object v1, v0, Lnh5;->C:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    iget-object v0, v0, Lnh5;->B:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_10

    .line 53
    .line 54
    :pswitch_1
    iget-wide v4, v0, Lnh5;->A:J

    .line 55
    .line 56
    iget-object v1, v0, Lnh5;->F:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 57
    .line 58
    iget-object v6, v0, Lnh5;->E:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Ljava/util/List;

    .line 61
    .line 62
    iget-object v7, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 63
    .line 64
    check-cast v7, Ljava/util/List;

    .line 65
    .line 66
    iget-object v8, v0, Lnh5;->C:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, Ljava/util/List;

    .line 69
    .line 70
    iget-object v11, v0, Lnh5;->B:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v11, Ljava/util/List;

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 v17, v2

    .line 78
    .line 79
    move-wide v10, v4

    .line 80
    move-object v2, v8

    .line 81
    move-object v15, v12

    .line 82
    move-object/from16 v4, p1

    .line 83
    .line 84
    move-object v12, v6

    .line 85
    goto/16 :goto_a

    .line 86
    .line 87
    :pswitch_2
    iget-wide v7, v0, Lnh5;->A:J

    .line 88
    .line 89
    iget-object v5, v0, Lnh5;->B:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, Ljava/util/List;

    .line 92
    .line 93
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object/from16 v17, v2

    .line 97
    .line 98
    move-object v10, v12

    .line 99
    move-object/from16 v2, p1

    .line 100
    .line 101
    goto/16 :goto_6

    .line 102
    .line 103
    :pswitch_3
    iget v5, v0, Lnh5;->H:I

    .line 104
    .line 105
    iget v7, v0, Lnh5;->G:I

    .line 106
    .line 107
    iget-wide v10, v0, Lnh5;->A:J

    .line 108
    .line 109
    iget-object v8, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 110
    .line 111
    check-cast v8, Ljava/lang/String;

    .line 112
    .line 113
    iget-object v13, v0, Lnh5;->C:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v13, [Llh5;

    .line 116
    .line 117
    iget-object v15, v0, Lnh5;->B:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v15, [Llh5;

    .line 120
    .line 121
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-wide/from16 v26, v10

    .line 125
    .line 126
    move-object v10, v12

    .line 127
    move-wide/from16 v11, v26

    .line 128
    .line 129
    move-object/from16 v17, v2

    .line 130
    .line 131
    move-object/from16 v2, p1

    .line 132
    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :pswitch_4
    iget v5, v0, Lnh5;->H:I

    .line 136
    .line 137
    iget v8, v0, Lnh5;->G:I

    .line 138
    .line 139
    iget-wide v10, v0, Lnh5;->A:J

    .line 140
    .line 141
    iget-object v13, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 142
    .line 143
    check-cast v13, Ljava/lang/String;

    .line 144
    .line 145
    iget-object v15, v0, Lnh5;->C:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v15, [Llh5;

    .line 148
    .line 149
    iget-object v7, v0, Lnh5;->B:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v7, [Llh5;

    .line 152
    .line 153
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    move-wide/from16 v26, v10

    .line 157
    .line 158
    move-object v10, v12

    .line 159
    move-wide/from16 v11, v26

    .line 160
    .line 161
    move-object/from16 v17, v2

    .line 162
    .line 163
    move-object/from16 v2, p1

    .line 164
    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :pswitch_5
    iget v5, v0, Lnh5;->H:I

    .line 168
    .line 169
    iget v8, v0, Lnh5;->G:I

    .line 170
    .line 171
    move-object v10, v12

    .line 172
    iget-wide v11, v0, Lnh5;->A:J

    .line 173
    .line 174
    iget-object v13, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 175
    .line 176
    check-cast v13, Ljava/lang/String;

    .line 177
    .line 178
    iget-object v15, v0, Lnh5;->C:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v15, [Llh5;

    .line 181
    .line 182
    iget-object v7, v0, Lnh5;->B:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v7, [Llh5;

    .line 185
    .line 186
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v17, v2

    .line 190
    .line 191
    move-object/from16 v2, p1

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :pswitch_6
    move-object v10, v12

    .line 196
    iget v5, v0, Lnh5;->H:I

    .line 197
    .line 198
    iget v7, v0, Lnh5;->G:I

    .line 199
    .line 200
    iget-wide v11, v0, Lnh5;->A:J

    .line 201
    .line 202
    iget-object v13, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 203
    .line 204
    check-cast v13, Ljava/lang/String;

    .line 205
    .line 206
    iget-object v15, v0, Lnh5;->C:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v15, [Llh5;

    .line 209
    .line 210
    iget-object v8, v0, Lnh5;->B:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v8, [Llh5;

    .line 213
    .line 214
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    move-wide/from16 v26, v11

    .line 218
    .line 219
    move-object v12, v8

    .line 220
    move-object v8, v13

    .line 221
    move-wide/from16 v13, v26

    .line 222
    .line 223
    move v11, v5

    .line 224
    move-object/from16 v5, p1

    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :pswitch_7
    move-object v10, v12

    .line 229
    iget v5, v0, Lnh5;->H:I

    .line 230
    .line 231
    iget v7, v0, Lnh5;->G:I

    .line 232
    .line 233
    iget-wide v11, v0, Lnh5;->A:J

    .line 234
    .line 235
    iget-object v8, v0, Lnh5;->E:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v8, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 238
    .line 239
    iget-object v13, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 240
    .line 241
    check-cast v13, Ljava/lang/String;

    .line 242
    .line 243
    iget-object v15, v0, Lnh5;->C:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v15, [Llh5;

    .line 246
    .line 247
    iget-object v14, v0, Lnh5;->B:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v14, [Llh5;

    .line 250
    .line 251
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v17, v15

    .line 255
    .line 256
    move-object v15, v13

    .line 257
    move/from16 v26, v5

    .line 258
    .line 259
    move-object/from16 v5, p1

    .line 260
    .line 261
    move-object/from16 v27, v8

    .line 262
    .line 263
    move/from16 v8, v26

    .line 264
    .line 265
    move-wide/from16 v28, v11

    .line 266
    .line 267
    move v11, v7

    .line 268
    move-object/from16 v12, v27

    .line 269
    .line 270
    move-object v7, v14

    .line 271
    move-wide/from16 v13, v28

    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :pswitch_8
    move-object v10, v12

    .line 276
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v5, p1

    .line 280
    .line 281
    goto :goto_0

    .line 282
    :pswitch_9
    move-object v10, v12

    .line 283
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    move-object v5, v2

    .line 287
    check-cast v5, Ldy7;

    .line 288
    .line 289
    iget-object v7, v5, Ldy7;->a:Lqe1;

    .line 290
    .line 291
    invoke-interface {v7}, Lqe1;->b()Ldi2;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    new-instance v8, Lc6;

    .line 296
    .line 297
    const/16 v11, 0x16

    .line 298
    .line 299
    invoke-direct {v8, v7, v11}, Lc6;-><init>(Ldi2;I)V

    .line 300
    .line 301
    .line 302
    iget-object v5, v5, Ldy7;->b:Lh81;

    .line 303
    .line 304
    invoke-static {v8, v5}, Lgr8;->L(Ldi2;Le81;)Ldi2;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    const/4 v7, 0x1

    .line 309
    iput v7, v0, Lnh5;->I:I

    .line 310
    .line 311
    invoke-static {v5, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    if-ne v5, v9, :cond_0

    .line 316
    .line 317
    goto/16 :goto_f

    .line 318
    .line 319
    :cond_0
    :goto_0
    check-cast v5, Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-nez v5, :cond_1

    .line 326
    .line 327
    new-instance v0, Lr84;

    .line 328
    .line 329
    invoke-direct {v0}, Lr84;-><init>()V

    .line 330
    .line 331
    .line 332
    return-object v0

    .line 333
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 334
    .line 335
    .line 336
    move-result-wide v7

    .line 337
    const-wide/32 v11, 0x5265c00

    .line 338
    .line 339
    .line 340
    div-long v11, v7, v11

    .line 341
    .line 342
    const/4 v7, 0x5

    .line 343
    new-array v15, v7, [Llh5;

    .line 344
    .line 345
    move-object v5, v4

    .line 346
    check-cast v5, Lc50;

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    sget-object v8, Lvz7;->a:Lvz7;

    .line 352
    .line 353
    const-string v13, "fechaVence"

    .line 354
    .line 355
    invoke-virtual {v5, v8, v13, v6}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    iput-object v15, v0, Lnh5;->B:Ljava/lang/Object;

    .line 360
    .line 361
    iput-object v15, v0, Lnh5;->C:Ljava/lang/Object;

    .line 362
    .line 363
    const-string v13, "saldo"

    .line 364
    .line 365
    iput-object v13, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 366
    .line 367
    iput-object v1, v0, Lnh5;->E:Ljava/lang/Object;

    .line 368
    .line 369
    iput-wide v11, v0, Lnh5;->A:J

    .line 370
    .line 371
    const/4 v8, 0x0

    .line 372
    iput v8, v0, Lnh5;->G:I

    .line 373
    .line 374
    const v8, 0x7f11030e

    .line 375
    .line 376
    .line 377
    iput v8, v0, Lnh5;->H:I

    .line 378
    .line 379
    const/4 v14, 0x2

    .line 380
    iput v14, v0, Lnh5;->I:I

    .line 381
    .line 382
    invoke-static {v5, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    if-ne v5, v9, :cond_2

    .line 387
    .line 388
    goto/16 :goto_f

    .line 389
    .line 390
    :cond_2
    move-object v7, v15

    .line 391
    move-object/from16 v17, v7

    .line 392
    .line 393
    move-object v15, v13

    .line 394
    move-wide v13, v11

    .line 395
    const/4 v11, 0x0

    .line 396
    move-object v12, v1

    .line 397
    :goto_1
    check-cast v5, Ljava/lang/String;

    .line 398
    .line 399
    invoke-static {v12, v5, v13, v14}, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;->f(Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;Ljava/lang/String;J)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    new-instance v12, Llh5;

    .line 404
    .line 405
    invoke-direct {v12, v8, v5, v15}, Llh5;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    aput-object v12, v17, v11

    .line 409
    .line 410
    move-object v5, v4

    .line 411
    check-cast v5, Lc50;

    .line 412
    .line 413
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    sget-object v8, Lxz7;->a:Lxz7;

    .line 417
    .line 418
    const-string v11, "datosDias"

    .line 419
    .line 420
    invoke-virtual {v5, v8, v11, v6}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    iput-object v7, v0, Lnh5;->B:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v7, v0, Lnh5;->C:Ljava/lang/Object;

    .line 427
    .line 428
    const-string v8, "datos"

    .line 429
    .line 430
    iput-object v8, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 431
    .line 432
    const/4 v11, 0x0

    .line 433
    iput-object v11, v0, Lnh5;->E:Ljava/lang/Object;

    .line 434
    .line 435
    iput-wide v13, v0, Lnh5;->A:J

    .line 436
    .line 437
    const/4 v11, 0x1

    .line 438
    iput v11, v0, Lnh5;->G:I

    .line 439
    .line 440
    const v11, 0x7f110306

    .line 441
    .line 442
    .line 443
    iput v11, v0, Lnh5;->H:I

    .line 444
    .line 445
    const/4 v12, 0x3

    .line 446
    iput v12, v0, Lnh5;->I:I

    .line 447
    .line 448
    invoke-static {v5, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    if-ne v5, v9, :cond_3

    .line 453
    .line 454
    goto/16 :goto_f

    .line 455
    .line 456
    :cond_3
    move-object v12, v7

    .line 457
    move-object v15, v12

    .line 458
    const/4 v7, 0x1

    .line 459
    :goto_2
    check-cast v5, Ljava/lang/String;

    .line 460
    .line 461
    invoke-static {v5}, Ld57;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    invoke-static {v5}, Lk57;->v0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    move-object/from16 v17, v2

    .line 474
    .line 475
    new-instance v2, Llh5;

    .line 476
    .line 477
    invoke-direct {v2, v11, v5, v8}, Llh5;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    aput-object v2, v15, v7

    .line 481
    .line 482
    move-object v2, v4

    .line 483
    check-cast v2, Lc50;

    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    sget-object v5, Lxz7;->a:Lxz7;

    .line 489
    .line 490
    const-string v7, "paquetesDias"

    .line 491
    .line 492
    invoke-virtual {v2, v5, v7, v6}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    iput-object v12, v0, Lnh5;->B:Ljava/lang/Object;

    .line 497
    .line 498
    iput-object v12, v0, Lnh5;->C:Ljava/lang/Object;

    .line 499
    .line 500
    const-string v5, "paquetes"

    .line 501
    .line 502
    iput-object v5, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 503
    .line 504
    iput-wide v13, v0, Lnh5;->A:J

    .line 505
    .line 506
    const/4 v7, 0x2

    .line 507
    iput v7, v0, Lnh5;->G:I

    .line 508
    .line 509
    const v8, 0x7f11030d

    .line 510
    .line 511
    .line 512
    iput v8, v0, Lnh5;->H:I

    .line 513
    .line 514
    const/4 v11, 0x4

    .line 515
    iput v11, v0, Lnh5;->I:I

    .line 516
    .line 517
    invoke-static {v2, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    if-ne v2, v9, :cond_4

    .line 522
    .line 523
    goto/16 :goto_f

    .line 524
    .line 525
    :cond_4
    move-object v15, v12

    .line 526
    move-wide v11, v13

    .line 527
    move-object v13, v5

    .line 528
    move v5, v8

    .line 529
    move v8, v7

    .line 530
    move-object v7, v15

    .line 531
    :goto_3
    check-cast v2, Ljava/lang/String;

    .line 532
    .line 533
    invoke-static {v2}, Ld57;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-static {v2}, Lk57;->v0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    new-instance v14, Llh5;

    .line 546
    .line 547
    invoke-direct {v14, v5, v2, v13}, Llh5;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    aput-object v14, v15, v8

    .line 551
    .line 552
    move-object v2, v4

    .line 553
    check-cast v2, Lc50;

    .line 554
    .line 555
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    sget-object v5, Luz7;->a:Luz7;

    .line 559
    .line 560
    const-string v8, "vozDias"

    .line 561
    .line 562
    invoke-virtual {v2, v5, v8, v6}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    iput-object v7, v0, Lnh5;->B:Ljava/lang/Object;

    .line 567
    .line 568
    iput-object v7, v0, Lnh5;->C:Ljava/lang/Object;

    .line 569
    .line 570
    const-string v13, "voz"

    .line 571
    .line 572
    iput-object v13, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 573
    .line 574
    iput-wide v11, v0, Lnh5;->A:J

    .line 575
    .line 576
    const/4 v5, 0x3

    .line 577
    iput v5, v0, Lnh5;->G:I

    .line 578
    .line 579
    const v5, 0x7f110313

    .line 580
    .line 581
    .line 582
    iput v5, v0, Lnh5;->H:I

    .line 583
    .line 584
    const/4 v8, 0x5

    .line 585
    iput v8, v0, Lnh5;->I:I

    .line 586
    .line 587
    invoke-static {v2, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    if-ne v2, v9, :cond_5

    .line 592
    .line 593
    goto/16 :goto_f

    .line 594
    .line 595
    :cond_5
    move-object v15, v7

    .line 596
    const/4 v8, 0x3

    .line 597
    :goto_4
    check-cast v2, Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {v2}, Ld57;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-static {v2}, Lk57;->v0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    new-instance v14, Llh5;

    .line 612
    .line 613
    invoke-direct {v14, v5, v2, v13}, Llh5;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    aput-object v14, v15, v8

    .line 617
    .line 618
    move-object v2, v4

    .line 619
    check-cast v2, Lc50;

    .line 620
    .line 621
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    sget-object v5, Ltz7;->a:Ltz7;

    .line 625
    .line 626
    const-string v8, "smsDias"

    .line 627
    .line 628
    invoke-virtual {v2, v5, v8, v6}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    iput-object v7, v0, Lnh5;->B:Ljava/lang/Object;

    .line 633
    .line 634
    iput-object v7, v0, Lnh5;->C:Ljava/lang/Object;

    .line 635
    .line 636
    const-string v8, "sms"

    .line 637
    .line 638
    iput-object v8, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 639
    .line 640
    iput-wide v11, v0, Lnh5;->A:J

    .line 641
    .line 642
    const/4 v5, 0x4

    .line 643
    iput v5, v0, Lnh5;->G:I

    .line 644
    .line 645
    const v13, 0x7f11030f

    .line 646
    .line 647
    .line 648
    iput v13, v0, Lnh5;->H:I

    .line 649
    .line 650
    const/4 v14, 0x6

    .line 651
    iput v14, v0, Lnh5;->I:I

    .line 652
    .line 653
    invoke-static {v2, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    if-ne v2, v9, :cond_6

    .line 658
    .line 659
    goto/16 :goto_f

    .line 660
    .line 661
    :cond_6
    move-object v15, v7

    .line 662
    move v7, v5

    .line 663
    move v5, v13

    .line 664
    move-object v13, v15

    .line 665
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 666
    .line 667
    invoke-static {v2}, Ld57;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    invoke-static {v2}, Lk57;->v0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    new-instance v14, Llh5;

    .line 680
    .line 681
    invoke-direct {v14, v5, v2, v8}, Llh5;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    aput-object v14, v13, v7

    .line 685
    .line 686
    invoke-static {v15}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 687
    .line 688
    .line 689
    move-result-object v5

    .line 690
    move-object/from16 v2, v17

    .line 691
    .line 692
    check-cast v2, Ldy7;

    .line 693
    .line 694
    iget-object v7, v2, Ldy7;->a:Lqe1;

    .line 695
    .line 696
    invoke-interface {v7}, Lqe1;->b()Ldi2;

    .line 697
    .line 698
    .line 699
    move-result-object v7

    .line 700
    new-instance v8, Lc6;

    .line 701
    .line 702
    const/16 v13, 0x15

    .line 703
    .line 704
    invoke-direct {v8, v7, v13}, Lc6;-><init>(Ldi2;I)V

    .line 705
    .line 706
    .line 707
    iget-object v2, v2, Ldy7;->b:Lh81;

    .line 708
    .line 709
    invoke-static {v8, v2}, Lgr8;->L(Ldi2;Le81;)Ldi2;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    iput-object v5, v0, Lnh5;->B:Ljava/lang/Object;

    .line 714
    .line 715
    const/4 v7, 0x0

    .line 716
    iput-object v7, v0, Lnh5;->C:Ljava/lang/Object;

    .line 717
    .line 718
    iput-object v7, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 719
    .line 720
    iput-wide v11, v0, Lnh5;->A:J

    .line 721
    .line 722
    const/4 v7, 0x7

    .line 723
    iput v7, v0, Lnh5;->I:I

    .line 724
    .line 725
    invoke-static {v2, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    if-ne v2, v9, :cond_7

    .line 730
    .line 731
    goto/16 :goto_f

    .line 732
    .line 733
    :cond_7
    move-wide v7, v11

    .line 734
    :goto_6
    check-cast v2, Ljava/util/List;

    .line 735
    .line 736
    new-instance v11, Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 739
    .line 740
    .line 741
    new-instance v12, Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 747
    .line 748
    .line 749
    move-result-object v5

    .line 750
    :cond_8
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 751
    .line 752
    .line 753
    move-result v13

    .line 754
    if-eqz v13, :cond_c

    .line 755
    .line 756
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v13

    .line 760
    check-cast v13, Llh5;

    .line 761
    .line 762
    iget-object v14, v13, Llh5;->c:Ljava/lang/Integer;

    .line 763
    .line 764
    if-eqz v14, :cond_8

    .line 765
    .line 766
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 767
    .line 768
    .line 769
    move-result v14

    .line 770
    const/4 v15, 0x1

    .line 771
    if-gt v15, v14, :cond_b

    .line 772
    .line 773
    const/4 v15, 0x3

    .line 774
    if-ge v14, v15, :cond_b

    .line 775
    .line 776
    iget-object v15, v13, Llh5;->a:Ljava/lang/String;

    .line 777
    .line 778
    move-object/from16 v16, v4

    .line 779
    .line 780
    move-object/from16 p1, v5

    .line 781
    .line 782
    int-to-long v4, v14

    .line 783
    add-long/2addr v4, v7

    .line 784
    move-object/from16 v18, v10

    .line 785
    .line 786
    new-instance v10, Ljava/lang/StringBuilder;

    .line 787
    .line 788
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    move-object/from16 v15, v18

    .line 795
    .line 796
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v10, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    if-nez v5, :cond_a

    .line 817
    .line 818
    iget v5, v13, Llh5;->b:I

    .line 819
    .line 820
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    const/4 v10, 0x1

    .line 828
    if-ne v14, v10, :cond_9

    .line 829
    .line 830
    const v10, 0x7f110312

    .line 831
    .line 832
    .line 833
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    invoke-virtual {v3, v10, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v5

    .line 841
    goto :goto_8

    .line 842
    :cond_9
    new-instance v10, Ljava/lang/Integer;

    .line 843
    .line 844
    invoke-direct {v10, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 845
    .line 846
    .line 847
    filled-new-array {v5, v10}, [Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v5

    .line 851
    const v10, 0x7f110308

    .line 852
    .line 853
    .line 854
    invoke-virtual {v3, v10, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v5

    .line 858
    :goto_8
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    :cond_a
    :goto_9
    move-object/from16 v5, p1

    .line 865
    .line 866
    move-object v10, v15

    .line 867
    move-object/from16 v4, v16

    .line 868
    .line 869
    goto :goto_7

    .line 870
    :cond_b
    move-object/from16 v16, v4

    .line 871
    .line 872
    move-object/from16 p1, v5

    .line 873
    .line 874
    move-object v15, v10

    .line 875
    goto :goto_9

    .line 876
    :cond_c
    move-object/from16 v16, v4

    .line 877
    .line 878
    move-object v15, v10

    .line 879
    move-object/from16 v4, v16

    .line 880
    .line 881
    check-cast v4, Lc50;

    .line 882
    .line 883
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    sget-object v5, Lwz7;->a:Lwz7;

    .line 887
    .line 888
    const-string v10, "fechaNacional"

    .line 889
    .line 890
    invoke-virtual {v4, v5, v10, v6}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    const/4 v5, 0x0

    .line 895
    iput-object v5, v0, Lnh5;->B:Ljava/lang/Object;

    .line 896
    .line 897
    iput-object v2, v0, Lnh5;->C:Ljava/lang/Object;

    .line 898
    .line 899
    iput-object v11, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 900
    .line 901
    iput-object v12, v0, Lnh5;->E:Ljava/lang/Object;

    .line 902
    .line 903
    iput-object v1, v0, Lnh5;->F:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 904
    .line 905
    iput-wide v7, v0, Lnh5;->A:J

    .line 906
    .line 907
    const/16 v5, 0x8

    .line 908
    .line 909
    iput v5, v0, Lnh5;->I:I

    .line 910
    .line 911
    invoke-static {v4, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    if-ne v4, v9, :cond_d

    .line 916
    .line 917
    goto/16 :goto_f

    .line 918
    .line 919
    :cond_d
    move-wide/from16 v26, v7

    .line 920
    .line 921
    move-object v7, v11

    .line 922
    move-wide/from16 v10, v26

    .line 923
    .line 924
    :goto_a
    check-cast v4, Ljava/lang/String;

    .line 925
    .line 926
    invoke-static {v1, v4, v10, v11}, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;->f(Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;Ljava/lang/String;J)Ljava/lang/Integer;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    if-eqz v1, :cond_e

    .line 931
    .line 932
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 933
    .line 934
    .line 935
    move-result v1

    .line 936
    const/16 v19, 0x1

    .line 937
    .line 938
    add-int/lit8 v1, v1, 0x1

    .line 939
    .line 940
    new-instance v4, Ljava/lang/Integer;

    .line 941
    .line 942
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 943
    .line 944
    .line 945
    goto :goto_b

    .line 946
    :cond_e
    const/4 v4, 0x0

    .line 947
    :goto_b
    if-eqz v4, :cond_11

    .line 948
    .line 949
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    if-ltz v1, :cond_11

    .line 954
    .line 955
    const/4 v5, 0x3

    .line 956
    if-ge v1, v5, :cond_11

    .line 957
    .line 958
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 959
    .line 960
    .line 961
    move-result v1

    .line 962
    int-to-long v5, v1

    .line 963
    add-long/2addr v5, v10

    .line 964
    new-instance v1, Ljava/lang/StringBuilder;

    .line 965
    .line 966
    const-string v8, "saldoNacional:::"

    .line 967
    .line 968
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v5

    .line 988
    if-nez v5, :cond_11

    .line 989
    .line 990
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 991
    .line 992
    .line 993
    move-result v5

    .line 994
    if-eqz v5, :cond_10

    .line 995
    .line 996
    const/4 v6, 0x1

    .line 997
    if-eq v5, v6, :cond_f

    .line 998
    .line 999
    const v5, 0x7f110309

    .line 1000
    .line 1001
    .line 1002
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    invoke-virtual {v3, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v4

    .line 1010
    goto :goto_c

    .line 1011
    :cond_f
    const v4, 0x7f11030b

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v4

    .line 1018
    goto :goto_c

    .line 1019
    :cond_10
    const v4, 0x7f11030a

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v4

    .line 1026
    :goto_c
    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    :cond_11
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1033
    .line 1034
    .line 1035
    move-result v1

    .line 1036
    if-nez v1, :cond_15

    .line 1037
    .line 1038
    const v1, 0x7f110305

    .line 1039
    .line 1040
    .line 1041
    const v4, 0x7f110304

    .line 1042
    .line 1043
    .line 1044
    const-string v5, "PlanExpiryChannel"

    .line 1045
    .line 1046
    const/4 v6, 0x3

    .line 1047
    invoke-static {v3, v5, v1, v4, v6}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v4

    .line 1058
    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    if-eqz v1, :cond_12

    .line 1063
    .line 1064
    const/high16 v4, 0xc000000

    .line 1065
    .line 1066
    const/4 v8, 0x0

    .line 1067
    invoke-static {v3, v8, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    move-object v8, v1

    .line 1072
    goto :goto_d

    .line 1073
    :cond_12
    const/4 v8, 0x0

    .line 1074
    :goto_d
    const v1, 0x7f11030c

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v5

    .line 1081
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    const/16 v24, 0x0

    .line 1085
    .line 1086
    const/16 v25, 0x3e

    .line 1087
    .line 1088
    const-string v21, "\n"

    .line 1089
    .line 1090
    const/16 v22, 0x0

    .line 1091
    .line 1092
    const/16 v23, 0x0

    .line 1093
    .line 1094
    move-object/from16 v20, v7

    .line 1095
    .line 1096
    invoke-static/range {v20 .. v25}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v6

    .line 1100
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    iget v7, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 1105
    .line 1106
    const-string v4, "PlanExpiryChannel"

    .line 1107
    .line 1108
    invoke-static/range {v3 .. v8}, Lsg3;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/PendingIntent;)Landroid/app/Notification;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    const v4, 0x31771

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v3, v4, v1}, Lsg3;->W(Landroid/content/Context;ILandroid/app/Notification;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-static {v2, v12}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    new-instance v2, Ljava/util/ArrayList;

    .line 1123
    .line 1124
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    :cond_13
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v3

    .line 1135
    if-eqz v3, :cond_14

    .line 1136
    .line 1137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    move-object v4, v3

    .line 1142
    check-cast v4, Ljava/lang/String;

    .line 1143
    .line 1144
    filled-new-array {v15}, [Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v5

    .line 1148
    const/4 v14, 0x6

    .line 1149
    invoke-static {v4, v5, v14}, Ld57;->W0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    const/4 v6, 0x1

    .line 1154
    invoke-static {v6, v4}, Ldt0;->z0(ILjava/util/List;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v4

    .line 1158
    check-cast v4, Ljava/lang/String;

    .line 1159
    .line 1160
    if-eqz v4, :cond_13

    .line 1161
    .line 1162
    invoke-static {v4}, Lk57;->w0(Ljava/lang/String;)Ljava/lang/Long;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v4

    .line 1166
    if-eqz v4, :cond_13

    .line 1167
    .line 1168
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v4

    .line 1172
    cmp-long v4, v4, v10

    .line 1173
    .line 1174
    if-ltz v4, :cond_13

    .line 1175
    .line 1176
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    goto :goto_e

    .line 1180
    :cond_14
    invoke-static {v2}, Ldt0;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v1

    .line 1184
    invoke-static {v1}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    const/4 v5, 0x0

    .line 1189
    iput-object v5, v0, Lnh5;->B:Ljava/lang/Object;

    .line 1190
    .line 1191
    iput-object v5, v0, Lnh5;->C:Ljava/lang/Object;

    .line 1192
    .line 1193
    iput-object v5, v0, Lnh5;->D:Ljava/io/Serializable;

    .line 1194
    .line 1195
    iput-object v5, v0, Lnh5;->E:Ljava/lang/Object;

    .line 1196
    .line 1197
    iput-object v5, v0, Lnh5;->F:Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 1198
    .line 1199
    iput-wide v10, v0, Lnh5;->A:J

    .line 1200
    .line 1201
    const/16 v2, 0x9

    .line 1202
    .line 1203
    iput v2, v0, Lnh5;->I:I

    .line 1204
    .line 1205
    move-object/from16 v2, v17

    .line 1206
    .line 1207
    check-cast v2, Ldy7;

    .line 1208
    .line 1209
    invoke-virtual {v2, v1, v0}, Ldy7;->B(Ljava/util/List;Lh61;)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    if-ne v0, v9, :cond_15

    .line 1214
    .line 1215
    :goto_f
    return-object v9

    .line 1216
    :cond_15
    :goto_10
    new-instance v0, Lr84;

    .line 1217
    .line 1218
    invoke-direct {v0}, Lr84;-><init>()V

    .line 1219
    .line 1220
    .line 1221
    return-object v0

    .line 1222
    nop

    .line 1223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
