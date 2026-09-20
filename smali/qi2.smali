.class public final Lqi2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldi2;

.field public final synthetic y:Lgs2;


# direct methods
.method public synthetic constructor <init>(Ldi2;Lgs2;I)V
    .locals 0

    .line 12
    iput p3, p0, Lqi2;->w:I

    iput-object p1, p0, Lqi2;->x:Ldi2;

    iput-object p2, p0, Lqi2;->y:Lgs2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lgs2;Ldi2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqi2;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqi2;->y:Lgs2;

    .line 8
    .line 9
    iput-object p2, p0, Lqi2;->x:Ldi2;

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
.end method


# virtual methods
.method public final a(Lfi2;Lf61;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lqi2;->w:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    sget-object v3, Lp81;->w:Lp81;

    .line 7
    .line 8
    iget-object v4, p0, Lqi2;->y:Lgs2;

    .line 9
    .line 10
    iget-object v5, p0, Lqi2;->x:Ldi2;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p0, Ln40;

    .line 16
    .line 17
    invoke-direct {p0, v1, p1, v4}, Ln40;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v5, p0, p2}, Ldi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-ne p0, v3, :cond_0

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    :cond_0
    return-object v2

    .line 28
    :pswitch_0
    new-instance p0, Ld06;

    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lqc;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    invoke-direct {v0, p0, p1, v4, v1}, Lqc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v5, v0, p2}, Ldi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-ne p0, v3, :cond_1

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    :cond_1
    return-object v2

    .line 47
    :pswitch_1
    instance-of v0, p2, Lpi2;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    move-object v0, p2

    .line 52
    check-cast v0, Lpi2;

    .line 53
    .line 54
    iget v6, v0, Lpi2;->A:I

    .line 55
    .line 56
    const/high16 v7, -0x80000000

    .line 57
    .line 58
    and-int v8, v6, v7

    .line 59
    .line 60
    if-eqz v8, :cond_2

    .line 61
    .line 62
    sub-int/2addr v6, v7

    .line 63
    iput v6, v0, Lpi2;->A:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    new-instance v0, Lpi2;

    .line 67
    .line 68
    invoke-direct {v0, p0, p2}, Lpi2;-><init>(Lqi2;Lf61;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p0, v0, Lpi2;->z:Ljava/lang/Object;

    .line 72
    .line 73
    iget p2, v0, Lpi2;->A:I

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x1

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    if-eq p2, v7, :cond_4

    .line 80
    .line 81
    if-ne p2, v1, :cond_3

    .line 82
    .line 83
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    move-object v2, v6

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    iget p1, v0, Lpi2;->E:I

    .line 95
    .line 96
    iget-object p2, v0, Lpi2;->D:Lvd6;

    .line 97
    .line 98
    iget-object v4, v0, Lpi2;->C:Lfi2;

    .line 99
    .line 100
    :try_start_0
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    move p0, p1

    .line 104
    move-object p1, v4

    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance p2, Lvd6;

    .line 112
    .line 113
    iget-object p0, v0, Lh61;->x:Le81;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2, p1, p0}, Lvd6;-><init>(Lfi2;Le81;)V

    .line 119
    .line 120
    .line 121
    :try_start_1
    iput-object p1, v0, Lpi2;->C:Lfi2;

    .line 122
    .line 123
    iput-object p2, v0, Lpi2;->D:Lvd6;

    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    iput p0, v0, Lpi2;->E:I

    .line 127
    .line 128
    iput v7, v0, Lpi2;->A:I

    .line 129
    .line 130
    invoke-interface {v4, p2, v0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    if-ne v4, v3, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    :goto_1
    invoke-virtual {p2}, Lh61;->t()V

    .line 138
    .line 139
    .line 140
    iput-object v6, v0, Lpi2;->C:Lfi2;

    .line 141
    .line 142
    iput-object v6, v0, Lpi2;->D:Lvd6;

    .line 143
    .line 144
    iput p0, v0, Lpi2;->E:I

    .line 145
    .line 146
    iput v1, v0, Lpi2;->A:I

    .line 147
    .line 148
    invoke-interface {v5, p1, v0}, Ldi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v3, :cond_7

    .line 153
    .line 154
    :goto_2
    move-object v2, v3

    .line 155
    :cond_7
    :goto_3
    return-object v2

    .line 156
    :goto_4
    invoke-virtual {p2}, Lh61;->t()V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
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
.end method
