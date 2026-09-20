.class public final synthetic Lg71;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:Z

.field public final synthetic B:Lse7;

.field public final synthetic C:Lhf7;

.field public final synthetic D:Lm78;

.field public final synthetic E:Lml4;

.field public final synthetic F:Lml4;

.field public final synthetic G:Lml4;

.field public final synthetic H:Lml4;

.field public final synthetic I:Lyb0;

.field public final synthetic J:Lze7;

.field public final synthetic K:Z

.field public final synthetic L:Z

.field public final synthetic M:Lw98;

.field public final synthetic N:Lo81;

.field public final synthetic O:Lvr2;

.field public final synthetic P:Lv35;

.field public final synthetic Q:Ltp1;

.field public final synthetic w:Ltg7;

.field public final synthetic x:Lu44;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ltg7;Lu44;IIZZLse7;Lhf7;Lm78;Lml4;Lml4;Lml4;Lml4;Lyb0;Lze7;ZZLw98;Lo81;Lvr2;Lv35;Ltp1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg71;->w:Ltg7;

    iput-object p2, p0, Lg71;->x:Lu44;

    iput p3, p0, Lg71;->y:I

    iput p4, p0, Lg71;->z:I

    iput-boolean p6, p0, Lg71;->A:Z

    iput-object p7, p0, Lg71;->B:Lse7;

    iput-object p8, p0, Lg71;->C:Lhf7;

    iput-object p9, p0, Lg71;->D:Lm78;

    iput-object p10, p0, Lg71;->E:Lml4;

    iput-object p11, p0, Lg71;->F:Lml4;

    iput-object p12, p0, Lg71;->G:Lml4;

    iput-object p13, p0, Lg71;->H:Lml4;

    iput-object p14, p0, Lg71;->I:Lyb0;

    iput-object p15, p0, Lg71;->J:Lze7;

    move/from16 p1, p16

    iput-boolean p1, p0, Lg71;->K:Z

    move/from16 p1, p17

    iput-boolean p1, p0, Lg71;->L:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lg71;->M:Lw98;

    move-object/from16 p1, p19

    iput-object p1, p0, Lg71;->N:Lo81;

    move-object/from16 p1, p20

    iput-object p1, p0, Lg71;->O:Lvr2;

    move-object/from16 p1, p21

    iput-object p1, p0, Lg71;->P:Lv35;

    move-object/from16 p1, p22

    iput-object p1, p0, Lg71;->Q:Ltp1;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lyt2;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    invoke-virtual {v1, v2, v3}, Lyt2;->V(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_a

    .line 30
    .line 31
    iget-object v8, v0, Lg71;->x:Lu44;

    .line 32
    .line 33
    iget-object v2, v8, Lu44;->g:Led5;

    .line 34
    .line 35
    invoke-virtual {v2}, Led5;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Llx1;

    .line 40
    .line 41
    iget v2, v2, Llx1;->w:F

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {v2, v3}, Llx1;->b(FF)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v3, v2

    .line 54
    :goto_1
    sget-object v4, Ljl4;->w:Ljl4;

    .line 55
    .line 56
    invoke-static {v4, v2, v3}, Lyu6;->e(Lml4;FF)Lml4;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget v3, v0, Lg71;->y:I

    .line 61
    .line 62
    iget v4, v0, Lg71;->z:I

    .line 63
    .line 64
    invoke-static {v3, v4}, Lrd3;->K(II)V

    .line 65
    .line 66
    .line 67
    iget-object v6, v0, Lg71;->w:Ltg7;

    .line 68
    .line 69
    if-ne v3, v5, :cond_2

    .line 70
    .line 71
    const v7, 0x7fffffff

    .line 72
    .line 73
    .line 74
    if-ne v4, v7, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    iget-boolean v7, v0, Lg71;->A:Z

    .line 78
    .line 79
    if-nez v7, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    new-instance v7, Llz2;

    .line 83
    .line 84
    invoke-direct {v7, v6, v3, v4}, Llz2;-><init>(Ltg7;II)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v7}, Lml4;->d(Lml4;)Lml4;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_2
    invoke-virtual {v1, v8}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    if-nez v3, :cond_4

    .line 100
    .line 101
    sget-object v3, Lay0;->a:Ld63;

    .line 102
    .line 103
    if-ne v7, v3, :cond_5

    .line 104
    .line 105
    :cond_4
    new-instance v7, Lzh;

    .line 106
    .line 107
    const/16 v3, 0x9

    .line 108
    .line 109
    invoke-direct {v7, v3, v8}, Lzh;-><init>(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    check-cast v7, Lsr2;

    .line 116
    .line 117
    iget-object v3, v0, Lg71;->B:Lse7;

    .line 118
    .line 119
    iget-object v9, v3, Lse7;->f:Led5;

    .line 120
    .line 121
    invoke-virtual {v9}, Led5;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, Lz75;

    .line 126
    .line 127
    iget-object v14, v0, Lg71;->C:Lhf7;

    .line 128
    .line 129
    iget-wide v10, v14, Lhf7;->b:J

    .line 130
    .line 131
    sget v12, Llg7;->c:I

    .line 132
    .line 133
    const/16 p1, 0x20

    .line 134
    .line 135
    shr-long v12, v10, p1

    .line 136
    .line 137
    long-to-int v12, v12

    .line 138
    move-object v13, v6

    .line 139
    iget-wide v5, v3, Lse7;->e:J

    .line 140
    .line 141
    move/from16 v18, v4

    .line 142
    .line 143
    move-wide v15, v5

    .line 144
    shr-long v4, v15, p1

    .line 145
    .line 146
    long-to-int v4, v4

    .line 147
    if-eq v12, v4, :cond_6

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    const-wide v19, 0xffffffffL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    and-long v4, v10, v19

    .line 156
    .line 157
    long-to-int v12, v4

    .line 158
    and-long v4, v15, v19

    .line 159
    .line 160
    long-to-int v4, v4

    .line 161
    if-eq v12, v4, :cond_7

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_7
    invoke-static {v10, v11}, Llg7;->f(J)I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    :goto_3
    iget-wide v4, v14, Lhf7;->b:J

    .line 169
    .line 170
    iput-wide v4, v3, Lse7;->e:J

    .line 171
    .line 172
    iget-object v4, v14, Lhf7;->a:Lvl;

    .line 173
    .line 174
    iget-object v5, v0, Lg71;->D:Lm78;

    .line 175
    .line 176
    invoke-static {v5, v4}, Lw18;->a(Lm78;Lvl;)Ltl7;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_9

    .line 185
    .line 186
    const/4 v6, 0x1

    .line 187
    if-ne v5, v6, :cond_8

    .line 188
    .line 189
    new-instance v5, Ll23;

    .line 190
    .line 191
    invoke-direct {v5, v3, v12, v4, v7}, Ll23;-><init>(Lse7;ILtl7;Lsr2;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_8
    invoke-static {}, Lh;->c()V

    .line 196
    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    return-object v0

    .line 200
    :cond_9
    new-instance v5, Lo48;

    .line 201
    .line 202
    invoke-direct {v5, v3, v12, v4, v7}, Lo48;-><init>(Lse7;ILtl7;Lsr2;)V

    .line 203
    .line 204
    .line 205
    :goto_4
    invoke-static {v2}, Ll95;->a(Lml4;)Lml4;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-static {v2}, Lwe;->g(Lml4;)Lml4;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-interface {v2, v5}, Lml4;->d(Lml4;)Lml4;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    iget-object v3, v0, Lg71;->E:Lml4;

    .line 218
    .line 219
    invoke-interface {v2, v3}, Lml4;->d(Lml4;)Lml4;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    iget-object v3, v0, Lg71;->F:Lml4;

    .line 224
    .line 225
    invoke-interface {v2, v3}, Lml4;->d(Lml4;)Lml4;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    new-instance v3, Lff7;

    .line 230
    .line 231
    invoke-direct {v3, v13}, Lff7;-><init>(Ltg7;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v2, v3}, Lml4;->d(Lml4;)Lml4;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iget-object v3, v0, Lg71;->G:Lml4;

    .line 239
    .line 240
    invoke-interface {v2, v3}, Lml4;->d(Lml4;)Lml4;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iget-object v3, v0, Lg71;->H:Lml4;

    .line 245
    .line 246
    invoke-interface {v2, v3}, Lml4;->d(Lml4;)Lml4;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iget-object v3, v0, Lg71;->I:Lyb0;

    .line 251
    .line 252
    invoke-static {v2, v3}, Lag8;->g(Lml4;Lyb0;)Lml4;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    new-instance v6, Lh71;

    .line 257
    .line 258
    iget-object v7, v0, Lg71;->J:Lze7;

    .line 259
    .line 260
    iget-boolean v9, v0, Lg71;->K:Z

    .line 261
    .line 262
    iget-boolean v10, v0, Lg71;->L:Z

    .line 263
    .line 264
    iget-object v11, v0, Lg71;->M:Lw98;

    .line 265
    .line 266
    iget-object v12, v0, Lg71;->N:Lo81;

    .line 267
    .line 268
    iget-object v13, v0, Lg71;->O:Lvr2;

    .line 269
    .line 270
    iget-object v15, v0, Lg71;->P:Lv35;

    .line 271
    .line 272
    iget-object v0, v0, Lg71;->Q:Ltp1;

    .line 273
    .line 274
    move-object/from16 v16, v0

    .line 275
    .line 276
    move-object/from16 v17, v3

    .line 277
    .line 278
    invoke-direct/range {v6 .. v18}, Lh71;-><init>(Lze7;Lu44;ZZLw98;Lo81;Lvr2;Lhf7;Lv35;Ltp1;Lyb0;I)V

    .line 279
    .line 280
    .line 281
    const v0, 0x54340ce8

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v6, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const/16 v3, 0x30

    .line 289
    .line 290
    invoke-static {v2, v0, v1, v3}, Lza5;->a(Lml4;Lfw0;Lyt2;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_a
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 295
    .line 296
    .line 297
    :goto_5
    sget-object v0, Lvs7;->a:Lvs7;

    .line 298
    .line 299
    return-object v0
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
.end method
