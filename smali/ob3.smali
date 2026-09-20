.class public final synthetic Lob3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lob3;->w:I

    iput-object p3, p0, Lob3;->y:Ljava/lang/Object;

    iput p1, p0, Lob3;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x5

    .line 2
    iput p2, p0, Lob3;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lob3;->x:I

    .line 8
    .line 9
    iput-object p3, p0, Lob3;->y:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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

.method public synthetic constructor <init>(ILa37;)V
    .locals 1

    .line 13
    const/4 v0, 0x6

    iput v0, p0, Lob3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lob3;->x:I

    iput-object p2, p0, Lob3;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lob3;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    sget-object v3, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v4, p0, Lob3;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iget p0, p0, Lob3;->x:I

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v4, La37;

    .line 16
    .line 17
    check-cast p1, Lyt2;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    if-eq v0, v2, :cond_0

    .line 28
    .line 29
    move v1, v5

    .line 30
    :cond_0
    and-int/2addr p2, v5

    .line 31
    invoke-virtual {p1, p2, v1}, Lyt2;->V(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    new-instance p2, Lz26;

    .line 38
    .line 39
    invoke-direct {p2, p0, v5}, Lz26;-><init>(II)V

    .line 40
    .line 41
    .line 42
    const p0, 0x56b6eacd

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p2, p1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance p2, Lxa7;

    .line 50
    .line 51
    const/16 v0, 0x13

    .line 52
    .line 53
    invoke-direct {p2, v0, v4}, Lxa7;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const v0, 0x47ef390b

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p2, p1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const/16 v0, 0x186

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-static {p0, v1, p2, p1, v0}, Lmp7;->l(Lfw0;Lml4;Lfw0;Lyt2;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-object v3

    .line 74
    :pswitch_0
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    check-cast p1, Lyt2;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lb85;->v(I)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-static {p0, v4, p1, p2}, Lmp7;->J(ILjava/lang/String;Lyt2;I)V

    .line 88
    .line 89
    .line 90
    return-object v3

    .line 91
    :pswitch_1
    check-cast v4, Lbb5;

    .line 92
    .line 93
    check-cast p1, Lyt2;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    and-int/lit8 v0, p2, 0x3

    .line 102
    .line 103
    if-eq v0, v2, :cond_2

    .line 104
    .line 105
    move v0, v5

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move v0, v1

    .line 108
    :goto_1
    and-int/2addr p2, v5

    .line 109
    invoke-virtual {p1, p2, v0}, Lyt2;->V(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_3

    .line 114
    .line 115
    iget-object p2, v4, Lbb5;->b:Luq3;

    .line 116
    .line 117
    invoke-virtual {p2}, Luq3;->x()Lig;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2, p0}, Lig;->e(I)Lhg3;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    iget v0, p2, Lhg3;->a:I

    .line 126
    .line 127
    sub-int/2addr p0, v0

    .line 128
    iget-object p2, p2, Lhg3;->c:Ld24;

    .line 129
    .line 130
    check-cast p2, Lva5;

    .line 131
    .line 132
    iget-object p2, p2, Lva5;->b:Lis2;

    .line 133
    .line 134
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v1, Leb5;->a:Leb5;

    .line 143
    .line 144
    invoke-interface {p2, v1, p0, p1, v0}, Lis2;->C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 149
    .line 150
    .line 151
    :goto_2
    return-object v3

    .line 152
    :pswitch_2
    check-cast v4, Lcu4;

    .line 153
    .line 154
    check-cast p1, Lyt2;

    .line 155
    .line 156
    check-cast p2, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    or-int/2addr p0, v5

    .line 162
    invoke-static {p0}, Lb85;->v(I)I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    invoke-virtual {v4, p0, p1}, Lcu4;->a(ILyt2;)V

    .line 167
    .line 168
    .line 169
    return-object v3

    .line 170
    :pswitch_3
    check-cast v4, Li34;

    .line 171
    .line 172
    check-cast p1, Lyt2;

    .line 173
    .line 174
    check-cast p2, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    and-int/lit8 v0, p2, 0x3

    .line 181
    .line 182
    if-eq v0, v2, :cond_4

    .line 183
    .line 184
    move v0, v5

    .line 185
    goto :goto_3

    .line 186
    :cond_4
    move v0, v1

    .line 187
    :goto_3
    and-int/2addr p2, v5

    .line 188
    invoke-virtual {p1, p2, v0}, Lyt2;->V(IZ)Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_5

    .line 193
    .line 194
    iget-object p2, v4, Li34;->b:Lh34;

    .line 195
    .line 196
    iget-object p2, p2, Lh34;->p:Lig;

    .line 197
    .line 198
    invoke-virtual {p2, p0}, Lig;->e(I)Lhg3;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    iget v0, p2, Lhg3;->a:I

    .line 203
    .line 204
    sub-int/2addr p0, v0

    .line 205
    iget-object p2, p2, Lhg3;->c:Ld24;

    .line 206
    .line 207
    check-cast p2, Lf34;

    .line 208
    .line 209
    iget-object p2, p2, Lf34;->c:Lfw0;

    .line 210
    .line 211
    iget-object v0, v4, Li34;->c:Lr04;

    .line 212
    .line 213
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {p2, v0, p0, p1, v1}, Lfw0;->C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_5
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 226
    .line 227
    .line 228
    :goto_4
    return-object v3

    .line 229
    :pswitch_4
    check-cast v4, Lwz3;

    .line 230
    .line 231
    check-cast p1, Lyt2;

    .line 232
    .line 233
    check-cast p2, Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    and-int/lit8 v0, p2, 0x3

    .line 240
    .line 241
    if-eq v0, v2, :cond_6

    .line 242
    .line 243
    move v1, v5

    .line 244
    :cond_6
    and-int/2addr p2, v5

    .line 245
    invoke-virtual {p1, p2, v1}, Lyt2;->V(IZ)Z

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-eqz p2, :cond_7

    .line 250
    .line 251
    iget-object p2, v4, Lwz3;->b:Lvz3;

    .line 252
    .line 253
    iget-object p2, p2, Lvz3;->q:Lig;

    .line 254
    .line 255
    invoke-virtual {p2, p0}, Lig;->e(I)Lhg3;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    iget v0, p2, Lhg3;->a:I

    .line 260
    .line 261
    sub-int/2addr p0, v0

    .line 262
    iget-object p2, p2, Lhg3;->c:Ld24;

    .line 263
    .line 264
    check-cast p2, Luz3;

    .line 265
    .line 266
    iget-object p2, p2, Luz3;->d:Lfw0;

    .line 267
    .line 268
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    const/4 v0, 0x6

    .line 273
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    sget-object v1, Lyz3;->a:Lyz3;

    .line 278
    .line 279
    invoke-virtual {p2, v1, p0, p1, v0}, Lfw0;->C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_7
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 284
    .line 285
    .line 286
    :goto_5
    return-object v3

    .line 287
    :pswitch_5
    check-cast v4, Lnb3;

    .line 288
    .line 289
    check-cast p1, Lyt2;

    .line 290
    .line 291
    check-cast p2, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    or-int/2addr p0, v5

    .line 297
    invoke-static {p0}, Lb85;->v(I)I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    invoke-static {v4, p1, p0}, Lgr8;->k(Lnb3;Lyt2;I)V

    .line 302
    .line 303
    .line 304
    return-object v3

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
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
