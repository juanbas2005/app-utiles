.class public final synthetic Lsz5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lsz5;->w:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lsz5;->x:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p1, p0, Lsz5;->y:J

    .line 9
    .line 10
    iput-object p5, p0, Lsz5;->z:Ljava/lang/String;

    .line 11
    .line 12
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lbu0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lyt2;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v3, 0x11

    .line 23
    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v1, v4, :cond_0

    .line 28
    .line 29
    move v1, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    and-int/2addr v3, v5

    .line 33
    invoke-virtual {v2, v3, v1}, Lyt2;->V(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sget-object v1, Lyu6;->a:Lsd2;

    .line 40
    .line 41
    const/high16 v3, 0x41400000    # 12.0f

    .line 42
    .line 43
    const/high16 v4, 0x41000000    # 8.0f

    .line 44
    .line 45
    invoke-static {v1, v4, v3}, Lx91;->L(Lml4;FF)Lml4;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v3, Lxb4;->L:Lg80;

    .line 50
    .line 51
    sget-object v4, Lwr;->c:Lsr;

    .line 52
    .line 53
    const/16 v6, 0x30

    .line 54
    .line 55
    invoke-static {v4, v3, v2, v6}, Lzt0;->a(Lvr;Lg80;Lyt2;I)Lau0;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iget-wide v6, v2, Lyt2;->T:J

    .line 60
    .line 61
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v2}, Lyt2;->m()Lvf5;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {v2, v1}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v7, Lux0;->d:Ltx0;

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v7, Ltx0;->b:Lvy0;

    .line 79
    .line 80
    invoke-virtual {v2}, Lyt2;->i0()V

    .line 81
    .line 82
    .line 83
    iget-boolean v8, v2, Lyt2;->S:Z

    .line 84
    .line 85
    if-eqz v8, :cond_1

    .line 86
    .line 87
    invoke-virtual {v2, v7}, Lyt2;->l(Lsr2;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {v2}, Lyt2;->r0()V

    .line 92
    .line 93
    .line 94
    :goto_1
    sget-object v7, Ltx0;->f:Lck;

    .line 95
    .line 96
    invoke-static {v7, v2, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v3, Ltx0;->e:Lck;

    .line 100
    .line 101
    invoke-static {v3, v2, v6}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object v4, Ltx0;->g:Lck;

    .line 109
    .line 110
    invoke-static {v4, v2, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v3, Ltx0;->h:Lce;

    .line 114
    .line 115
    invoke-static {v2, v3}, Lg75;->O(Lyt2;Lvr2;)V

    .line 116
    .line 117
    .line 118
    sget-object v3, Ltx0;->d:Lck;

    .line 119
    .line 120
    invoke-static {v3, v2, v1}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-wide v3, Ljt0;->c:J

    .line 124
    .line 125
    const v1, 0x3ee66666    # 0.45f

    .line 126
    .line 127
    .line 128
    invoke-static {v1, v3, v4}, Ljt0;->b(FJ)J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const/16 v1, 0xa

    .line 133
    .line 134
    move-wide v8, v3

    .line 135
    move v3, v5

    .line 136
    move-wide v4, v6

    .line 137
    invoke-static {v1}, Lya5;->k(I)J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    const/16 v23, 0x0

    .line 142
    .line 143
    const v24, 0x3ffea

    .line 144
    .line 145
    .line 146
    move-object/from16 v21, v2

    .line 147
    .line 148
    iget-object v2, v0, Lsz5;->w:Ljava/lang/String;

    .line 149
    .line 150
    move v10, v3

    .line 151
    const/4 v3, 0x0

    .line 152
    move-wide v11, v8

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x0

    .line 155
    move v14, v10

    .line 156
    move-wide v12, v11

    .line 157
    const-wide/16 v10, 0x0

    .line 158
    .line 159
    move-wide v15, v12

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    move/from16 v18, v14

    .line 163
    .line 164
    move-wide/from16 v16, v15

    .line 165
    .line 166
    const-wide/16 v14, 0x0

    .line 167
    .line 168
    move-wide/from16 v19, v16

    .line 169
    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    move/from16 v22, v18

    .line 175
    .line 176
    const/16 v18, 0x0

    .line 177
    .line 178
    move-wide/from16 v25, v19

    .line 179
    .line 180
    const/16 v19, 0x0

    .line 181
    .line 182
    const/16 v20, 0x0

    .line 183
    .line 184
    move/from16 v27, v22

    .line 185
    .line 186
    const/16 v22, 0x6180

    .line 187
    .line 188
    move/from16 p1, v1

    .line 189
    .line 190
    move-wide/from16 v28, v25

    .line 191
    .line 192
    move/from16 v1, v27

    .line 193
    .line 194
    invoke-static/range {v2 .. v24}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v2, v21

    .line 198
    .line 199
    const/high16 v3, 0x40800000    # 4.0f

    .line 200
    .line 201
    sget-object v4, Ljl4;->w:Ljl4;

    .line 202
    .line 203
    invoke-static {v4, v3}, Lyu6;->d(Lml4;F)Lml4;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v2, v3}, Lk75;->a(Lyt2;Lml4;)V

    .line 208
    .line 209
    .line 210
    const/16 v3, 0x12

    .line 211
    .line 212
    invoke-static {v3}, Lya5;->k(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v6

    .line 216
    sget-object v8, Lam2;->B:Lam2;

    .line 217
    .line 218
    const v24, 0x3ffaa

    .line 219
    .line 220
    .line 221
    iget-object v2, v0, Lsz5;->x:Ljava/lang/String;

    .line 222
    .line 223
    const/4 v3, 0x0

    .line 224
    iget-wide v4, v0, Lsz5;->y:J

    .line 225
    .line 226
    const v22, 0x186000

    .line 227
    .line 228
    .line 229
    invoke-static/range {v2 .. v24}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 230
    .line 231
    .line 232
    const v2, 0x3eb33333    # 0.35f

    .line 233
    .line 234
    .line 235
    move-wide/from16 v12, v28

    .line 236
    .line 237
    invoke-static {v2, v12, v13}, Ljt0;->b(FJ)J

    .line 238
    .line 239
    .line 240
    move-result-wide v4

    .line 241
    invoke-static/range {p1 .. p1}, Lya5;->k(I)J

    .line 242
    .line 243
    .line 244
    move-result-wide v6

    .line 245
    const v24, 0x3ffea

    .line 246
    .line 247
    .line 248
    iget-object v2, v0, Lsz5;->z:Ljava/lang/String;

    .line 249
    .line 250
    const/4 v8, 0x0

    .line 251
    const/4 v12, 0x0

    .line 252
    const/4 v13, 0x0

    .line 253
    const/16 v22, 0x6180

    .line 254
    .line 255
    invoke-static/range {v2 .. v24}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 256
    .line 257
    .line 258
    move-object/from16 v2, v21

    .line 259
    .line 260
    invoke-virtual {v2, v1}, Lyt2;->r(Z)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_2
    invoke-virtual {v2}, Lyt2;->Y()V

    .line 265
    .line 266
    .line 267
    :goto_2
    sget-object v0, Lvs7;->a:Lvs7;

    .line 268
    .line 269
    return-object v0
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
.end method
