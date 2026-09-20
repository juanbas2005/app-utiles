.class public final Lk52;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lm52;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lm52;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lk52;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Lk52;->y:Lm52;

    .line 4
    .line 5
    iput-wide p2, p0, Lk52;->z:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 9
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


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lk52;->x:I

    .line 2
    .line 3
    iget-wide v1, p0, Lk52;->z:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x2

    .line 9
    const/4 v7, 0x1

    .line 10
    iget-object v8, p0, Lk52;->y:Lm52;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La52;

    .line 16
    .line 17
    iget-object v0, v8, Lm52;->V:Ljb;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v8}, Lm52;->X0()Ljb;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, v8, Lm52;->V:Ljb;

    .line 30
    .line 31
    invoke-virtual {v8}, Lm52;->X0()Ljb;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    if-eq p1, v7, :cond_4

    .line 49
    .line 50
    if-ne p1, v6, :cond_3

    .line 51
    .line 52
    iget-object p1, v8, Lm52;->Q:Lx82;

    .line 53
    .line 54
    iget-object p1, p1, Lx82;->a:Lnm7;

    .line 55
    .line 56
    iget-object p1, p1, Lnm7;->c:Lcn0;

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iget-object p1, p1, Lcn0;->b:Lvr2;

    .line 61
    .line 62
    new-instance v0, Lwe3;

    .line 63
    .line 64
    iget-wide v2, p0, Lk52;->z:J

    .line 65
    .line 66
    invoke-direct {v0, v2, v3}, Lwe3;-><init>(J)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lwe3;

    .line 74
    .line 75
    iget-wide v4, p0, Lwe3;->a:J

    .line 76
    .line 77
    invoke-virtual {v8}, Lm52;->X0()Ljb;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v6, Ley3;->w:Ley3;

    .line 85
    .line 86
    invoke-interface/range {v1 .. v6}, Ljb;->a(JJLey3;)J

    .line 87
    .line 88
    .line 89
    move-result-wide p0

    .line 90
    iget-object v1, v8, Lm52;->V:Ljb;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-interface/range {v1 .. v6}, Ljb;->a(JJLey3;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-static {p0, p1, v0, v1}, Loe3;->b(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    goto :goto_0

    .line 104
    :cond_3
    invoke-static {}, Lh;->c()V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    :goto_0
    new-instance v5, Loe3;

    .line 109
    .line 110
    invoke-direct {v5, v3, v4}, Loe3;-><init>(J)V

    .line 111
    .line 112
    .line 113
    :goto_1
    return-object v5

    .line 114
    :pswitch_0
    check-cast p1, La52;

    .line 115
    .line 116
    sget-object p0, La52;->y:La52;

    .line 117
    .line 118
    if-ne p1, p0, :cond_5

    .line 119
    .line 120
    iget-object p0, v8, Lm52;->Q:Lx82;

    .line 121
    .line 122
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 123
    .line 124
    iget-object p0, p0, Lnm7;->b:Ldv6;

    .line 125
    .line 126
    if-nez p0, :cond_5

    .line 127
    .line 128
    iget-object p0, v8, Lm52;->R:Ltr6;

    .line 129
    .line 130
    iget-wide v3, p0, Ltr6;->i:J

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    iget-object p0, v8, Lm52;->P:Ln52;

    .line 134
    .line 135
    iget-object p0, p0, Ln52;->a:Lnm7;

    .line 136
    .line 137
    iget-object p0, p0, Lnm7;->b:Ldv6;

    .line 138
    .line 139
    if-eqz p0, :cond_6

    .line 140
    .line 141
    iget-object p0, p0, Ldv6;->a:Lvr2;

    .line 142
    .line 143
    new-instance v0, Lwe3;

    .line 144
    .line 145
    invoke-direct {v0, v1, v2}, Lwe3;-><init>(J)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p0, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Loe3;

    .line 153
    .line 154
    iget-wide v9, p0, Loe3;->a:J

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move-wide v9, v3

    .line 158
    :goto_2
    iget-object p0, v8, Lm52;->Q:Lx82;

    .line 159
    .line 160
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 161
    .line 162
    iget-object p0, p0, Lnm7;->b:Ldv6;

    .line 163
    .line 164
    if-eqz p0, :cond_7

    .line 165
    .line 166
    iget-object p0, p0, Ldv6;->a:Lvr2;

    .line 167
    .line 168
    new-instance v0, Lwe3;

    .line 169
    .line 170
    invoke-direct {v0, v1, v2}, Lwe3;-><init>(J)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p0, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, Loe3;

    .line 178
    .line 179
    iget-wide v0, p0, Loe3;->a:J

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    move-wide v0, v3

    .line 183
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_9

    .line 188
    .line 189
    if-eq p0, v7, :cond_a

    .line 190
    .line 191
    if-ne p0, v6, :cond_8

    .line 192
    .line 193
    move-wide v3, v0

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    invoke-static {}, Lh;->c()V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_9
    move-wide v3, v9

    .line 200
    :cond_a
    :goto_4
    new-instance v5, Loe3;

    .line 201
    .line 202
    invoke-direct {v5, v3, v4}, Loe3;-><init>(J)V

    .line 203
    .line 204
    .line 205
    :goto_5
    return-object v5

    .line 206
    :pswitch_1
    check-cast p1, La52;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-eqz p0, :cond_c

    .line 213
    .line 214
    if-eq p0, v7, :cond_d

    .line 215
    .line 216
    if-ne p0, v6, :cond_b

    .line 217
    .line 218
    iget-object p0, v8, Lm52;->Q:Lx82;

    .line 219
    .line 220
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 221
    .line 222
    iget-object p0, p0, Lnm7;->c:Lcn0;

    .line 223
    .line 224
    if-eqz p0, :cond_d

    .line 225
    .line 226
    iget-object p0, p0, Lcn0;->b:Lvr2;

    .line 227
    .line 228
    if-eqz p0, :cond_d

    .line 229
    .line 230
    new-instance p1, Lwe3;

    .line 231
    .line 232
    invoke-direct {p1, v1, v2}, Lwe3;-><init>(J)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    check-cast p0, Lwe3;

    .line 240
    .line 241
    iget-wide v1, p0, Lwe3;->a:J

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_b
    invoke-static {}, Lh;->c()V

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_c
    iget-object p0, v8, Lm52;->P:Ln52;

    .line 249
    .line 250
    iget-object p0, p0, Ln52;->a:Lnm7;

    .line 251
    .line 252
    iget-object p0, p0, Lnm7;->c:Lcn0;

    .line 253
    .line 254
    if-eqz p0, :cond_d

    .line 255
    .line 256
    iget-object p0, p0, Lcn0;->b:Lvr2;

    .line 257
    .line 258
    if-eqz p0, :cond_d

    .line 259
    .line 260
    new-instance p1, Lwe3;

    .line 261
    .line 262
    invoke-direct {p1, v1, v2}, Lwe3;-><init>(J)V

    .line 263
    .line 264
    .line 265
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, Lwe3;

    .line 270
    .line 271
    iget-wide v1, p0, Lwe3;->a:J

    .line 272
    .line 273
    :cond_d
    :goto_6
    new-instance v5, Lwe3;

    .line 274
    .line 275
    invoke-direct {v5, v1, v2}, Lwe3;-><init>(J)V

    .line 276
    .line 277
    .line 278
    :goto_7
    return-object v5

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
