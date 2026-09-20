.class public abstract Lyz4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lhp4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lv25;->a:Lhp4;

    .line 2
    .line 3
    new-instance v0, Lhp4;

    .line 4
    .line 5
    invoke-direct {v0}, Lhp4;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyz4;->a:Lhp4;

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
.end method

.method public static final a(Lll4;II)V
    .locals 3

    .line 1
    instance-of v0, p0, Lwo1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lwo1;

    .line 7
    .line 8
    iget v1, v0, Lwo1;->K:I

    .line 9
    .line 10
    and-int v2, v1, p1

    .line 11
    .line 12
    invoke-static {p0, v2, p2}, Lyz4;->b(Lll4;II)V

    .line 13
    .line 14
    .line 15
    not-int p0, v1

    .line 16
    and-int/2addr p0, p1

    .line 17
    iget-object p1, v0, Lwo1;->L:Lll4;

    .line 18
    .line 19
    :goto_0
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p1, p0, p2}, Lyz4;->a(Lll4;II)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Lll4;->B:Lll4;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    iget v0, p0, Lll4;->y:I

    .line 29
    .line 30
    and-int/2addr p1, v0

    .line 31
    invoke-static {p0, p1, p2}, Lyz4;->b(Lll4;II)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public static final b(Lll4;II)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lll4;->K0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    and-int/lit8 v0, p1, 0x2

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    instance-of v0, p0, Lmy3;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Lmy3;

    .line 22
    .line 23
    invoke-static {v0}, Lsu0;->B(Lmy3;)V

    .line 24
    .line 25
    .line 26
    if-ne p2, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0, v1}, Lrc9;->M0(Lvo1;I)Lxz4;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lxz4;->o1()V

    .line 33
    .line 34
    .line 35
    :cond_1
    and-int/lit16 v0, p1, 0x80

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eq p2, v1, :cond_2

    .line 40
    .line 41
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Luy3;->G()V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/high16 v0, 0x400000

    .line 49
    .line 50
    and-int/2addr v0, p1

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    if-eq p2, v1, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0, v2}, Luy3;->Y(Z)V

    .line 61
    .line 62
    .line 63
    :cond_3
    and-int/lit16 v0, p1, 0x100

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    if-eqz v0, :cond_8

    .line 67
    .line 68
    instance-of v0, p0, Law2;

    .line 69
    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    if-eq p2, v2, :cond_5

    .line 73
    .line 74
    if-eq p2, v1, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v3, v0, Luy3;->i0:I

    .line 82
    .line 83
    add-int/lit8 v3, v3, -0x1

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Luy3;->e0(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget v3, v0, Luy3;->i0:I

    .line 94
    .line 95
    add-int/2addr v3, v2

    .line 96
    invoke-virtual {v0, v3}, Luy3;->e0(I)V

    .line 97
    .line 98
    .line 99
    :goto_0
    if-eq p2, v1, :cond_8

    .line 100
    .line 101
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget v3, v0, Luy3;->i0:I

    .line 106
    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    invoke-virtual {v0}, Luy3;->p()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_8

    .line 114
    .line 115
    invoke-virtual {v0}, Luy3;->q()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_8

    .line 120
    .line 121
    iget-boolean v3, v0, Luy3;->h0:Z

    .line 122
    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    check-cast v3, Lje;

    .line 131
    .line 132
    iget-object v4, v3, Lje;->m0:Lih4;

    .line 133
    .line 134
    iget-object v4, v4, Lih4;->e:Lhv2;

    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget v5, v0, Luy3;->i0:I

    .line 140
    .line 141
    if-lez v5, :cond_7

    .line 142
    .line 143
    iget-object v4, v4, Lhv2;->y:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Leq4;

    .line 146
    .line 147
    invoke-virtual {v4, v0}, Leq4;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-boolean v2, v0, Luy3;->h0:Z

    .line 151
    .line 152
    :cond_7
    const/4 v0, 0x0

    .line 153
    invoke-virtual {v3, v0}, Lje;->F(Luy3;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_1
    and-int/lit8 v0, p1, 0x4

    .line 157
    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    instance-of v0, p0, Lgz1;

    .line 161
    .line 162
    if-eqz v0, :cond_9

    .line 163
    .line 164
    move-object v0, p0

    .line 165
    check-cast v0, Lgz1;

    .line 166
    .line 167
    invoke-static {v0}, Lrc9;->e0(Lgz1;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    and-int/lit8 v0, p1, 0x8

    .line 171
    .line 172
    if-eqz v0, :cond_a

    .line 173
    .line 174
    instance-of v0, p0, Ldk6;

    .line 175
    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iput-boolean v2, v0, Luy3;->M:Z

    .line 183
    .line 184
    :cond_a
    and-int/lit8 v0, p1, 0x40

    .line 185
    .line 186
    if-eqz v0, :cond_b

    .line 187
    .line 188
    instance-of v0, p0, Lgd5;

    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    move-object v0, p0

    .line 193
    check-cast v0, Lgd5;

    .line 194
    .line 195
    invoke-static {v0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v0, v0, Luy3;->b0:Lyy3;

    .line 200
    .line 201
    iget-object v3, v0, Lyy3;->p:Lkh4;

    .line 202
    .line 203
    iput-boolean v2, v3, Lkh4;->M:Z

    .line 204
    .line 205
    iget-object v0, v0, Lyy3;->q:Ljd4;

    .line 206
    .line 207
    if-eqz v0, :cond_b

    .line 208
    .line 209
    iput-boolean v2, v0, Ljd4;->S:Z

    .line 210
    .line 211
    :cond_b
    and-int/lit16 v0, p1, 0x800

    .line 212
    .line 213
    if-eqz v0, :cond_d

    .line 214
    .line 215
    instance-of v0, p0, Le40;

    .line 216
    .line 217
    if-nez v0, :cond_c

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_c
    check-cast p0, Le40;

    .line 221
    .line 222
    iget-object p0, p0, Le40;->K:Lkl4;

    .line 223
    .line 224
    const-string p1, "applyFocusProperties called on wrong node"

    .line 225
    .line 226
    invoke-static {p1}, Lyb3;->b(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Lku4;->a()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_d
    :goto_2
    and-int/lit16 v0, p1, 0x1000

    .line 237
    .line 238
    if-eqz v0, :cond_e

    .line 239
    .line 240
    instance-of v0, p0, Lck2;

    .line 241
    .line 242
    if-eqz v0, :cond_e

    .line 243
    .line 244
    move-object v0, p0

    .line 245
    check-cast v0, Lck2;

    .line 246
    .line 247
    invoke-static {v0}, Lrc9;->P0(Lvo1;)Lp95;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Lje;

    .line 252
    .line 253
    invoke-virtual {v2}, Lje;->getFocusOwner()Lik2;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Llk2;

    .line 258
    .line 259
    iget-object v2, v2, Llk2;->d:Lgk2;

    .line 260
    .line 261
    iget-object v3, v2, Lgk2;->d:Lup4;

    .line 262
    .line 263
    invoke-virtual {v3, v0}, Lup4;->a(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_e

    .line 268
    .line 269
    invoke-virtual {v2}, Lgk2;->a()V

    .line 270
    .line 271
    .line 272
    :cond_e
    const/high16 v0, 0x200000

    .line 273
    .line 274
    and-int/2addr p1, v0

    .line 275
    if-eqz p1, :cond_f

    .line 276
    .line 277
    instance-of p1, p0, Lbb3;

    .line 278
    .line 279
    if-eqz p1, :cond_f

    .line 280
    .line 281
    if-ne p2, v1, :cond_f

    .line 282
    .line 283
    check-cast p0, Lbb3;

    .line 284
    .line 285
    invoke-interface {p0}, Lbb3;->h0()V

    .line 286
    .line 287
    .line 288
    :cond_f
    :goto_3
    return-void
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

.method public static final c(Lll4;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lll4;->J:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lyz4;->a(Lll4;II)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public static final d(Lkl4;)I
    .locals 2

    .line 1
    instance-of v0, p0, Lky3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    :goto_0
    instance-of v1, p0, Lfz1;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    or-int/lit8 v0, v0, 0x4

    .line 13
    .line 14
    :cond_1
    instance-of v1, p0, Lbk6;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x8

    .line 19
    .line 20
    :cond_2
    instance-of v1, p0, Lfd5;

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    or-int/lit8 v0, v0, 0x40

    .line 25
    .line 26
    :cond_3
    instance-of p0, p0, Lvb0;

    .line 27
    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    const/high16 p0, 0x80000

    .line 31
    .line 32
    or-int/2addr p0, v0

    .line 33
    return p0

    .line 34
    :cond_4
    return v0
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
.end method

.method public static final e(Lll4;)I
    .locals 5

    .line 1
    iget v0, p0, Lll4;->y:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lyz4;->a:Lhp4;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lhp4;->d(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ltz v2, :cond_1

    .line 17
    .line 18
    iget-object p0, v1, Lhp4;->c:[I

    .line 19
    .line 20
    aget p0, p0, v2

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    instance-of v2, p0, Lmy3;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 v2, 0x1

    .line 30
    :goto_0
    instance-of v3, p0, Lgz1;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    or-int/lit8 v2, v2, 0x4

    .line 35
    .line 36
    :cond_3
    instance-of v3, p0, Ldk6;

    .line 37
    .line 38
    if-eqz v3, :cond_4

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    :cond_4
    instance-of v3, p0, Ltk5;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    or-int/lit8 v2, v2, 0x10

    .line 47
    .line 48
    :cond_5
    instance-of v3, p0, Lol4;

    .line 49
    .line 50
    if-eqz v3, :cond_6

    .line 51
    .line 52
    or-int/lit8 v2, v2, 0x20

    .line 53
    .line 54
    :cond_6
    instance-of v3, p0, Lgd5;

    .line 55
    .line 56
    if-eqz v3, :cond_7

    .line 57
    .line 58
    or-int/lit8 v2, v2, 0x40

    .line 59
    .line 60
    :cond_7
    instance-of v3, p0, Lby3;

    .line 61
    .line 62
    if-eqz v3, :cond_8

    .line 63
    .line 64
    const v3, 0x400080

    .line 65
    .line 66
    .line 67
    or-int/2addr v2, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_8
    instance-of v3, p0, Lsh4;

    .line 70
    .line 71
    if-eqz v3, :cond_9

    .line 72
    .line 73
    or-int/lit16 v2, v2, 0x80

    .line 74
    .line 75
    :cond_9
    :goto_1
    instance-of v3, p0, Law2;

    .line 76
    .line 77
    if-eqz v3, :cond_a

    .line 78
    .line 79
    or-int/lit16 v2, v2, 0x100

    .line 80
    .line 81
    :cond_a
    instance-of v3, p0, Lvk2;

    .line 82
    .line 83
    if-eqz v3, :cond_b

    .line 84
    .line 85
    or-int/lit16 v2, v2, 0x400

    .line 86
    .line 87
    :cond_b
    instance-of v4, p0, Le40;

    .line 88
    .line 89
    if-eqz v4, :cond_c

    .line 90
    .line 91
    or-int/lit16 v2, v2, 0x800

    .line 92
    .line 93
    :cond_c
    instance-of v4, p0, Lck2;

    .line 94
    .line 95
    if-eqz v4, :cond_d

    .line 96
    .line 97
    or-int/lit16 v2, v2, 0x1000

    .line 98
    .line 99
    :cond_d
    instance-of v4, p0, Lus3;

    .line 100
    .line 101
    if-eqz v4, :cond_e

    .line 102
    .line 103
    or-int/lit16 v2, v2, 0x2000

    .line 104
    .line 105
    :cond_e
    instance-of v4, p0, Lxd;

    .line 106
    .line 107
    if-eqz v4, :cond_f

    .line 108
    .line 109
    or-int/lit16 v2, v2, 0x4000

    .line 110
    .line 111
    :cond_f
    instance-of v4, p0, Lry0;

    .line 112
    .line 113
    if-eqz v4, :cond_10

    .line 114
    .line 115
    const v4, 0x8000

    .line 116
    .line 117
    .line 118
    or-int/2addr v2, v4

    .line 119
    :cond_10
    instance-of v4, p0, Lln7;

    .line 120
    .line 121
    if-eqz v4, :cond_11

    .line 122
    .line 123
    const/high16 v4, 0x40000

    .line 124
    .line 125
    or-int/2addr v2, v4

    .line 126
    :cond_11
    instance-of v4, p0, Lvb0;

    .line 127
    .line 128
    if-eqz v4, :cond_12

    .line 129
    .line 130
    const/high16 v4, 0x80000

    .line 131
    .line 132
    or-int/2addr v2, v4

    .line 133
    :cond_12
    if-eqz v3, :cond_13

    .line 134
    .line 135
    const/high16 v3, 0x100000

    .line 136
    .line 137
    or-int/2addr v2, v3

    .line 138
    :cond_13
    instance-of v3, p0, Lbb3;

    .line 139
    .line 140
    if-eqz v3, :cond_14

    .line 141
    .line 142
    const/high16 v3, 0x200000

    .line 143
    .line 144
    or-int/2addr v2, v3

    .line 145
    :cond_14
    instance-of p0, p0, Lb24;

    .line 146
    .line 147
    if-eqz p0, :cond_15

    .line 148
    .line 149
    const/high16 p0, 0x800000

    .line 150
    .line 151
    or-int/2addr v2, p0

    .line 152
    :cond_15
    invoke-virtual {v1, v2, v0}, Lhp4;->g(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return v2
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

.method public static final f(Lll4;)I
    .locals 2

    .line 1
    instance-of v0, p0, Lwo1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lwo1;

    .line 6
    .line 7
    iget v0, p0, Lwo1;->K:I

    .line 8
    .line 9
    iget-object p0, p0, Lwo1;->L:Lll4;

    .line 10
    .line 11
    :goto_0
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lyz4;->f(Lll4;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    iget-object p0, p0, Lll4;->B:Lll4;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v0

    .line 22
    :cond_1
    invoke-static {p0}, Lyz4;->e(Lll4;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
    .line 27
    .line 28
    .line 29
.end method

.method public static final g(I)Z
    .locals 4

    .line 1
    and-int/lit16 v0, p0, 0x80

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const/high16 v3, 0x400000

    .line 11
    .line 12
    and-int/2addr p0, v3

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    move v1, v2

    .line 16
    :cond_1
    or-int p0, v0, v1

    .line 17
    .line 18
    return p0
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
