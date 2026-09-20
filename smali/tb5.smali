.class public final Ltb5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Leh2;


# instance fields
.field public final a:Lax6;

.field public final b:Lob5;


# direct methods
.method public constructor <init>(Lax6;Lob5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltb5;->a:Lax6;

    .line 5
    .line 6
    iput-object p2, p0, Ltb5;->b:Lob5;

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
.method public final a(Leh6;FLf61;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lsb5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lsb5;

    .line 7
    .line 8
    iget v1, v0, Lsb5;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsb5;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsb5;

    .line 21
    .line 22
    check-cast p3, Lh61;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lsb5;-><init>(Ltb5;Lh61;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lsb5;->z:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lsb5;->B:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Lh43;

    .line 51
    .line 52
    const/16 v1, 0x1a

    .line 53
    .line 54
    invoke-direct {p3, v1, p0, p1}, Lh43;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput v3, v0, Lsb5;->B:I

    .line 58
    .line 59
    iget-object v1, p0, Ltb5;->a:Lax6;

    .line 60
    .line 61
    invoke-virtual {v1, p1, p2, p3, v0}, Lax6;->d(Leh6;FLvr2;Lh61;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    sget-object p1, Lp81;->w:Lp81;

    .line 66
    .line 67
    if-ne p3, p1, :cond_3

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget-object p0, p0, Ltb5;->b:Lob5;

    .line 77
    .line 78
    invoke-virtual {p0}, Lob5;->l()F

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/4 p3, 0x0

    .line 83
    cmpg-float p2, p2, p3

    .line 84
    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-virtual {p0}, Lob5;->l()F

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    float-to-double v0, p2

    .line 97
    const-wide v3, 0x3f50624dd2f1a9fcL    # 0.001

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    cmpg-double p2, v0, v3

    .line 103
    .line 104
    if-gez p2, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0}, Lob5;->k()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iget-object v0, p0, Lob5;->k:Lhn1;

    .line 111
    .line 112
    invoke-virtual {v0}, Lhn1;->a()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    iget-object v0, p0, Lob5;->m:Led5;

    .line 119
    .line 120
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Ldb5;

    .line 125
    .line 126
    iget-object v0, v0, Ldb5;->s:Lo81;

    .line 127
    .line 128
    new-instance v1, Lxa5;

    .line 129
    .line 130
    const/4 v3, 0x2

    .line 131
    invoke-direct {v1, p0, v2, v3}, Lxa5;-><init>(Lob5;Lf61;I)V

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x3

    .line 135
    invoke-static {v0, v2, v2, v1, v3}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 136
    .line 137
    .line 138
    :cond_5
    const/4 v0, 0x0

    .line 139
    invoke-virtual {p0, p2, p3, v0}, Lob5;->t(IFZ)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lob5;->l()F

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    new-instance p2, Ljava/lang/Float;

    .line 148
    .line 149
    invoke-direct {p2, p0}, Ljava/lang/Float;-><init>(F)V

    .line 150
    .line 151
    .line 152
    :goto_3
    new-instance p0, Ljava/lang/Float;

    .line 153
    .line 154
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 155
    .line 156
    .line 157
    return-object p0
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
.end method
