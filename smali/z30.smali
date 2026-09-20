.class public final synthetic Lz30;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laq4;

.field public final synthetic y:Laq4;


# direct methods
.method public synthetic constructor <init>(Laq4;Laq4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz30;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lz30;->x:Laq4;

    .line 4
    .line 5
    iput-object p2, p0, Lz30;->y:Laq4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lz30;->w:I

    .line 4
    .line 5
    iget-object v2, v0, Lz30;->y:Laq4;

    .line 6
    .line 7
    iget-object v0, v0, Lz30;->x:Laq4;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Lyb5;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, Lyb5;->w:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, v1, Lyb5;->x:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0, v3}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2, v1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lvs7;->a:Lvs7;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, Lch0;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v3, v1, Lch0;->w:Lhd0;

    .line 44
    .line 45
    invoke-interface {v3}, Lhd0;->e()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    const-wide v5, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v3, v5

    .line 55
    long-to-int v3, v3

    .line 56
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const-wide v7, 0x40261eb851eb851fL    # 11.06

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    double-to-float v4, v7

    .line 70
    float-to-double v7, v4

    .line 71
    invoke-static {v7, v8}, Ljava/lang/Math;->tan(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    double-to-float v4, v7

    .line 76
    mul-float/2addr v3, v4

    .line 77
    iget-object v4, v1, Lch0;->w:Lhd0;

    .line 78
    .line 79
    invoke-interface {v4}, Lhd0;->e()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    shr-long/2addr v7, v4

    .line 86
    long-to-int v7, v7

    .line 87
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    const/high16 v8, 0x40000000    # 2.0f

    .line 92
    .line 93
    div-float/2addr v7, v8

    .line 94
    div-float/2addr v3, v8

    .line 95
    add-float/2addr v7, v3

    .line 96
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    int-to-long v9, v7

    .line 101
    const/4 v7, 0x0

    .line 102
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    int-to-long v11, v11

    .line 107
    shl-long/2addr v9, v4

    .line 108
    and-long/2addr v11, v5

    .line 109
    or-long v14, v9, v11

    .line 110
    .line 111
    iget-object v9, v1, Lch0;->w:Lhd0;

    .line 112
    .line 113
    invoke-interface {v9}, Lhd0;->e()J

    .line 114
    .line 115
    .line 116
    move-result-wide v9

    .line 117
    shr-long/2addr v9, v4

    .line 118
    long-to-int v9, v9

    .line 119
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    div-float/2addr v9, v8

    .line 124
    sub-float/2addr v9, v3

    .line 125
    iget-object v3, v1, Lch0;->w:Lhd0;

    .line 126
    .line 127
    invoke-interface {v3}, Lhd0;->e()J

    .line 128
    .line 129
    .line 130
    move-result-wide v10

    .line 131
    and-long/2addr v10, v5

    .line 132
    long-to-int v3, v10

    .line 133
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    int-to-long v8, v8

    .line 142
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    int-to-long v10, v3

    .line 147
    shl-long v3, v8, v4

    .line 148
    .line 149
    and-long/2addr v5, v10

    .line 150
    or-long v16, v3, v5

    .line 151
    .line 152
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Ljt0;

    .line 161
    .line 162
    iget-wide v4, v4, Ljt0;->a:J

    .line 163
    .line 164
    sget-wide v6, Ljt0;->g:J

    .line 165
    .line 166
    invoke-static {v4, v5, v6, v7}, Ljt0;->c(JJ)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_0

    .line 171
    .line 172
    sget-wide v4, Ljt0;->f:J

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_0
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Ljt0;

    .line 180
    .line 181
    iget-wide v4, v0, Ljt0;->a:J

    .line 182
    .line 183
    :goto_0
    new-instance v0, Ljt0;

    .line 184
    .line 185
    invoke-direct {v0, v4, v5}, Ljt0;-><init>(J)V

    .line 186
    .line 187
    .line 188
    new-instance v4, Lyb5;

    .line 189
    .line 190
    invoke-direct {v4, v3, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const v0, 0x3f395810    # 0.724f

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sget-wide v8, Ljt0;->f:J

    .line 201
    .line 202
    new-instance v3, Ljt0;

    .line 203
    .line 204
    invoke-direct {v3, v8, v9}, Ljt0;-><init>(J)V

    .line 205
    .line 206
    .line 207
    new-instance v5, Lyb5;

    .line 208
    .line 209
    invoke-direct {v5, v0, v3}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    filled-new-array {v4, v5}, [Lyb5;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    const/16 v18, 0x8

    .line 217
    .line 218
    invoke-static/range {v13 .. v18}, Lkw5;->k([Lyb5;JJI)Lp64;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    const v3, 0x3e82a993    # 0.2552f

    .line 223
    .line 224
    .line 225
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    new-instance v4, Ljt0;

    .line 230
    .line 231
    invoke-direct {v4, v8, v9}, Ljt0;-><init>(J)V

    .line 232
    .line 233
    .line 234
    new-instance v5, Lyb5;

    .line 235
    .line 236
    invoke-direct {v5, v3, v4}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    const/high16 v3, 0x3f800000    # 1.0f

    .line 240
    .line 241
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-interface {v2}, La37;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, Ljt0;

    .line 250
    .line 251
    iget-wide v10, v4, Ljt0;->a:J

    .line 252
    .line 253
    invoke-static {v10, v11, v6, v7}, Ljt0;->c(JJ)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_1

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_1
    invoke-interface {v2}, La37;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    check-cast v2, Ljt0;

    .line 265
    .line 266
    iget-wide v8, v2, Ljt0;->a:J

    .line 267
    .line 268
    :goto_1
    new-instance v2, Ljt0;

    .line 269
    .line 270
    invoke-direct {v2, v8, v9}, Ljt0;-><init>(J)V

    .line 271
    .line 272
    .line 273
    new-instance v4, Lyb5;

    .line 274
    .line 275
    invoke-direct {v4, v3, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    filled-new-array {v5, v4}, [Lyb5;

    .line 279
    .line 280
    .line 281
    move-result-object v13

    .line 282
    const/16 v18, 0x8

    .line 283
    .line 284
    invoke-static/range {v13 .. v18}, Lkw5;->k([Lyb5;JJI)Lp64;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    new-instance v3, Lm0;

    .line 289
    .line 290
    const/4 v4, 0x7

    .line 291
    invoke-direct {v3, v4, v0, v2}, Lm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    new-instance v0, Lpb;

    .line 295
    .line 296
    const/4 v2, 0x6

    .line 297
    invoke-direct {v0, v2, v3}, Lpb;-><init>(ILjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v0}, Lch0;->a(Lvr2;)Lwv2;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    return-object v0

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
