.class public final Ltm6;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:Lnd3;

.field public B:Lvm6;

.field public C:Lsm6;

.field public D:Loe2;

.field public E:Lcom/google/firebase/sessions/SessionDetails;

.field public F:Lrn6;

.field public G:I

.field public final synthetic H:Lvm6;

.field public final synthetic I:Lcom/google/firebase/sessions/SessionDetails;


# direct methods
.method public constructor <init>(Lvm6;Lcom/google/firebase/sessions/SessionDetails;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltm6;->H:Lvm6;

    .line 2
    .line 3
    iput-object p2, p0, Ltm6;->I:Lcom/google/firebase/sessions/SessionDetails;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La97;-><init>(ILf61;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    invoke-virtual {p0, p2, p1}, Ltm6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ltm6;

    .line 10
    .line 11
    sget-object p1, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ltm6;->s(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 1

    .line 1
    new-instance p2, Ltm6;

    .line 2
    .line 3
    iget-object v0, p0, Ltm6;->H:Lvm6;

    .line 4
    .line 5
    iget-object p0, p0, Ltm6;->I:Lcom/google/firebase/sessions/SessionDetails;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Ltm6;-><init>(Lvm6;Lcom/google/firebase/sessions/SessionDetails;Lf61;)V

    .line 8
    .line 9
    .line 10
    return-object p2
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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ltm6;->G:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, Ltm6;->H:Lvm6;

    .line 9
    .line 10
    sget-object v6, Lp81;->w:Lp81;

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v4, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, Ltm6;->F:Lrn6;

    .line 21
    .line 22
    iget-object v2, v0, Ltm6;->E:Lcom/google/firebase/sessions/SessionDetails;

    .line 23
    .line 24
    iget-object v3, v0, Ltm6;->D:Loe2;

    .line 25
    .line 26
    iget-object v4, v0, Ltm6;->C:Lsm6;

    .line 27
    .line 28
    iget-object v5, v0, Ltm6;->B:Lvm6;

    .line 29
    .line 30
    iget-object v0, v0, Ltm6;->A:Lnd3;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v7, v1

    .line 36
    move-object v1, v0

    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    return-object v0

    .line 47
    :cond_1
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v1, p1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v1, p1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput v4, v0, Ltm6;->G:I

    .line 63
    .line 64
    invoke-static {v5, v0}, Lvm6;->a(Lvm6;Lh61;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-ne v1, v6, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_b

    .line 78
    .line 79
    iget-object v1, v5, Lvm6;->b:Lwe2;

    .line 80
    .line 81
    iput v3, v0, Ltm6;->G:I

    .line 82
    .line 83
    sget-object v3, Lnd3;->c:Ljv2;

    .line 84
    .line 85
    invoke-virtual {v3, v1, v0}, Ljv2;->g(Lwe2;Lh61;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-ne v1, v6, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    :goto_1
    check-cast v1, Lnd3;

    .line 93
    .line 94
    sget-object v4, Lsm6;->a:Lsm6;

    .line 95
    .line 96
    iget-object v3, v5, Lvm6;->a:Loe2;

    .line 97
    .line 98
    iget-object v7, v5, Lvm6;->c:Lrn6;

    .line 99
    .line 100
    sget-object v8, Lzf2;->a:Lzf2;

    .line 101
    .line 102
    iput-object v1, v0, Ltm6;->A:Lnd3;

    .line 103
    .line 104
    iput-object v5, v0, Ltm6;->B:Lvm6;

    .line 105
    .line 106
    iput-object v4, v0, Ltm6;->C:Lsm6;

    .line 107
    .line 108
    iput-object v3, v0, Ltm6;->D:Loe2;

    .line 109
    .line 110
    iget-object v9, v0, Ltm6;->I:Lcom/google/firebase/sessions/SessionDetails;

    .line 111
    .line 112
    iput-object v9, v0, Ltm6;->E:Lcom/google/firebase/sessions/SessionDetails;

    .line 113
    .line 114
    iput-object v7, v0, Ltm6;->F:Lrn6;

    .line 115
    .line 116
    iput v2, v0, Ltm6;->G:I

    .line 117
    .line 118
    invoke-virtual {v8, v0}, Lzf2;->b(Lh61;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v6, :cond_6

    .line 123
    .line 124
    :goto_2
    return-object v6

    .line 125
    :cond_6
    move-object v2, v9

    .line 126
    :goto_3
    check-cast v0, Ljava/util/Map;

    .line 127
    .line 128
    iget-object v15, v1, Lnd3;->a:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v1, v1, Lnd3;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v4, Lrm6;

    .line 151
    .line 152
    new-instance v8, Lym6;

    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionDetails;->getSessionId()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionDetails;->getFirstSessionId()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionDetails;->getSessionIndex()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionDetails;->getSessionStartTimestampUs()J

    .line 167
    .line 168
    .line 169
    move-result-wide v12

    .line 170
    new-instance v14, Lke1;

    .line 171
    .line 172
    sget-object v2, Lnn6;->x:Lnn6;

    .line 173
    .line 174
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Lh91;

    .line 179
    .line 180
    sget-object v6, Lje1;->z:Lje1;

    .line 181
    .line 182
    sget-object v16, Lje1;->y:Lje1;

    .line 183
    .line 184
    sget-object v17, Lje1;->x:Lje1;

    .line 185
    .line 186
    if-nez v2, :cond_7

    .line 187
    .line 188
    move-object/from16 p0, v1

    .line 189
    .line 190
    move-object/from16 v2, v17

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_7
    iget-object v2, v2, Lh91;->a:Lge1;

    .line 194
    .line 195
    invoke-virtual {v2}, Lge1;->a()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_8

    .line 200
    .line 201
    move-object/from16 p0, v1

    .line 202
    .line 203
    move-object/from16 v2, v16

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_8
    move-object/from16 p0, v1

    .line 207
    .line 208
    move-object v2, v6

    .line 209
    :goto_4
    sget-object v1, Lnn6;->w:Lnn6;

    .line 210
    .line 211
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Lh91;

    .line 216
    .line 217
    if-nez v0, :cond_9

    .line 218
    .line 219
    move-object/from16 v6, v17

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_9
    iget-object v0, v0, Lh91;->a:Lge1;

    .line 223
    .line 224
    invoke-virtual {v0}, Lge1;->a()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_a

    .line 229
    .line 230
    move-object/from16 v6, v16

    .line 231
    .line 232
    :cond_a
    :goto_5
    invoke-virtual {v7}, Lrn6;->a()D

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    invoke-direct {v14, v2, v6, v0, v1}, Lke1;-><init>(Lje1;Lje1;D)V

    .line 237
    .line 238
    .line 239
    move-object/from16 v16, p0

    .line 240
    .line 241
    invoke-direct/range {v8 .. v16}, Lym6;-><init>(Ljava/lang/String;Ljava/lang/String;IJLke1;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v3}, Lsm6;->a(Loe2;)Lhr;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-direct {v4, v8, v0}, Lrm6;-><init>(Lym6;Lhr;)V

    .line 249
    .line 250
    .line 251
    sget v0, Lvm6;->g:I

    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    const-string v1, "FirebaseSessions"

    .line 257
    .line 258
    :try_start_0
    iget-object v0, v5, Lvm6;->d:Lc72;

    .line 259
    .line 260
    invoke-virtual {v0, v4}, Lc72;->a(Lrm6;)V

    .line 261
    .line 262
    .line 263
    const-string v0, "Successfully logged Session Start event."

    .line 264
    .line 265
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :catch_0
    move-exception v0

    .line 270
    const-string v2, "Error logging Session Start event to DataTransport: "

    .line 271
    .line 272
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 273
    .line 274
    .line 275
    :cond_b
    :goto_6
    sget-object v0, Lvs7;->a:Lvs7;

    .line 276
    .line 277
    return-object v0
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
.end method
