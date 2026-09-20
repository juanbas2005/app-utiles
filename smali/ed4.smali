.class public final Led4;
.super Ldh5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic x:I

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Led4;->x:I

    .line 2
    .line 3
    iput-object p2, p0, Led4;->y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final Y()F
    .locals 1

    .line 1
    iget v0, p0, Led4;->x:I

    .line 2
    .line 3
    iget-object p0, p0, Led4;->y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lje;

    .line 9
    .line 10
    invoke-virtual {p0}, Lje;->getDensity()Ltp1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ltp1;->Y()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p0, Ldd4;

    .line 20
    .line 21
    invoke-interface {p0}, Ltp1;->Y()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Led4;->x:I

    .line 2
    .line 3
    iget-object p0, p0, Led4;->y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lje;

    .line 9
    .line 10
    invoke-virtual {p0}, Lje;->getDensity()Ltp1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ltp1;->b()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p0, Ldd4;

    .line 20
    .line 21
    invoke-interface {p0}, Ltp1;->b()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public c(Lk23;F)F
    .locals 8

    .line 1
    iget v0, p0, Led4;->x:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return p2

    .line 7
    :pswitch_0
    iget-object v0, p1, Lk23;->a:Lgs2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p0, p1}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Led4;->y:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ldd4;

    .line 30
    .line 31
    iget-boolean v0, p0, Ldd4;->K:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_1
    new-instance v0, Lh06;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p0, v0, Lh06;->w:Ljava/lang/Object;

    .line 43
    .line 44
    :goto_0
    iget-object v1, v0, Lh06;->w:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ldd4;

    .line 47
    .line 48
    iget-object v1, v1, Ldd4;->M:Lao;

    .line 49
    .line 50
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v3, v1, Lao;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, [Lk23;

    .line 57
    .line 58
    invoke-static {p1, v3}, Lqs;->c1(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-gez v3, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-object v1, v1, Lao;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, [F

    .line 68
    .line 69
    aget v1, v1, v3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    move v1, v2

    .line 73
    :goto_2
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    iget-object v4, v0, Lh06;->w:Ljava/lang/Object;

    .line 78
    .line 79
    if-nez v3, :cond_4

    .line 80
    .line 81
    check-cast v4, Ldd4;

    .line 82
    .line 83
    invoke-virtual {p0}, Ldd4;->G0()Luy3;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {v4, p2, p1}, Ldd4;->n0(Luy3;Lk23;)V

    .line 88
    .line 89
    .line 90
    iget-object p2, v0, Lh06;->w:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p2, Ldd4;

    .line 93
    .line 94
    invoke-virtual {p2}, Ldd4;->B0()Ldy3;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p0}, Ldd4;->B0()Ldy3;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p1, v1, p2, p0}, Lk23;->a(FLdy3;Ldy3;)F

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_4
    check-cast v4, Ldd4;

    .line 109
    .line 110
    iget-object v1, v4, Ldd4;->D:Lgs2;

    .line 111
    .line 112
    if-eqz v1, :cond_a

    .line 113
    .line 114
    iget-object v3, v4, Ldd4;->E:Lvr2;

    .line 115
    .line 116
    if-eqz v3, :cond_a

    .line 117
    .line 118
    invoke-interface {v3, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    const/4 v4, 0x1

    .line 129
    if-ne v3, v4, :cond_a

    .line 130
    .line 131
    iget-object v3, v0, Lh06;->w:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Ldd4;

    .line 134
    .line 135
    iget-object v4, v3, Ldd4;->G:Ltp4;

    .line 136
    .line 137
    if-nez v4, :cond_5

    .line 138
    .line 139
    sget-object v4, Lbg6;->a:[J

    .line 140
    .line 141
    new-instance v4, Ltp4;

    .line 142
    .line 143
    invoke-direct {v4}, Ltp4;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v4, v3, Ldd4;->G:Ltp4;

    .line 147
    .line 148
    :cond_5
    invoke-virtual {v4, p1}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    if-nez v5, :cond_6

    .line 153
    .line 154
    new-instance v5, Lgh5;

    .line 155
    .line 156
    invoke-virtual {v3}, Ldd4;->J0()Lmh4;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-direct {v5, v6, v3, p1}, Lgh5;-><init>(Lmh4;Ldd4;Lk23;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, p1, v5}, Ltp4;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    check-cast v5, Lgh5;

    .line 167
    .line 168
    invoke-virtual {v3}, Ldd4;->J0()Lmh4;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iput-object v3, v5, Lgh5;->w:Lmh4;

    .line 173
    .line 174
    invoke-virtual {p0}, Ldd4;->G0()Luy3;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    iget-object v3, v3, Luy3;->J:Lp95;

    .line 179
    .line 180
    if-eqz v3, :cond_7

    .line 181
    .line 182
    check-cast v3, Lje;

    .line 183
    .line 184
    invoke-virtual {v3}, Lje;->getSnapshotObserver()Lr95;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-eqz v3, :cond_7

    .line 189
    .line 190
    sget-object v4, Lxc4;->z:Lxc4;

    .line 191
    .line 192
    new-instance v6, Lad4;

    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    invoke-direct {v6, v1, v0, p1, v7}, Lad4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 196
    .line 197
    .line 198
    iget-object v1, v3, Lr95;->a:Lcy6;

    .line 199
    .line 200
    invoke-virtual {v1, v5, v4, v6}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 201
    .line 202
    .line 203
    :cond_7
    iget-object v1, v0, Lh06;->w:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, Ldd4;

    .line 206
    .line 207
    invoke-virtual {p0}, Ldd4;->G0()Luy3;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v1, v3, p1}, Ldd4;->n0(Luy3;Lk23;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Lh06;->w:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v1, Ldd4;

    .line 217
    .line 218
    iget-object v1, v1, Ldd4;->M:Lao;

    .line 219
    .line 220
    if-eqz v1, :cond_9

    .line 221
    .line 222
    iget-object v3, v1, Lao;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v3, [Lk23;

    .line 225
    .line 226
    invoke-static {p1, v3}, Lqs;->c1(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-gez v3, :cond_8

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_8
    iget-object v1, v1, Lao;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v1, [F

    .line 236
    .line 237
    aget v2, v1, v3

    .line 238
    .line 239
    :cond_9
    :goto_3
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_a

    .line 244
    .line 245
    iget-object p2, v0, Lh06;->w:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast p2, Ldd4;

    .line 248
    .line 249
    invoke-virtual {p2}, Ldd4;->B0()Ldy3;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {p0}, Ldd4;->B0()Ldy3;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p1, v2, p2, p0}, Lk23;->a(FLdy3;Ldy3;)F

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    goto :goto_4

    .line 262
    :cond_a
    iget-object v1, v0, Lh06;->w:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Ldd4;

    .line 265
    .line 266
    invoke-virtual {v1}, Ldd4;->K0()Ldd4;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-nez v1, :cond_b

    .line 271
    .line 272
    iget-object v0, v0, Lh06;->w:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Ldd4;

    .line 275
    .line 276
    invoke-virtual {p0}, Ldd4;->G0()Luy3;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-virtual {v0, p0, p1}, Ldd4;->n0(Luy3;Lk23;)V

    .line 281
    .line 282
    .line 283
    :goto_4
    return p2

    .line 284
    :cond_b
    iput-object v1, v0, Lh06;->w:Ljava/lang/Object;

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final d()Ley3;
    .locals 1

    .line 1
    iget v0, p0, Led4;->x:I

    .line 2
    .line 3
    iget-object p0, p0, Led4;->y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lje;

    .line 9
    .line 10
    invoke-virtual {p0}, Lje;->getLayoutDirection()Ley3;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Ldd4;

    .line 16
    .line 17
    invoke-interface {p0}, Lkg3;->getLayoutDirection()Ley3;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Led4;->x:I

    .line 2
    .line 3
    iget-object p0, p0, Led4;->y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lje;

    .line 9
    .line 10
    invoke-virtual {p0}, Lje;->getRoot()Luy3;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Luy3;->b0:Lyy3;

    .line 15
    .line 16
    iget-object p0, p0, Lyy3;->p:Lkh4;

    .line 17
    .line 18
    iget p0, p0, Leh5;->w:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_0
    check-cast p0, Ldd4;

    .line 22
    .line 23
    invoke-virtual {p0}, Leh5;->b0()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
