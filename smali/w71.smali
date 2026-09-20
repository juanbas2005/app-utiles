.class public final synthetic Lw71;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx71;


# direct methods
.method public synthetic constructor <init>(Lx71;I)V
    .locals 0

    .line 10
    iput p2, p0, Lw71;->w:I

    iput-object p1, p0, Lw71;->x:Lx71;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx71;Lok6;)V
    .locals 0

    .line 1
    const/4 p2, 0x3

    .line 2
    iput p2, p0, Lw71;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lw71;->x:Lx71;

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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lw71;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lw71;->x:Lx71;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lvl;

    .line 12
    .line 13
    iget-boolean v0, p0, Lx71;->P:Z

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    iget-boolean v0, p0, Lx71;->Q:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 24
    .line 25
    iget-object v0, v0, Lu44;->e:Lvf7;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v4, Lie2;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v5, Lou0;

    .line 35
    .line 36
    invoke-direct {v5, p1, v2}, Lou0;-><init>(Lvl;I)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    new-array p1, p1, [Lh22;

    .line 41
    .line 42
    aput-object v4, p1, v3

    .line 43
    .line 44
    aput-object v5, p1, v2

    .line 45
    .line 46
    invoke-static {p1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p0, p0, Lx71;->O:Lu44;

    .line 51
    .line 52
    iget-object v3, p0, Lu44;->d:Ljz0;

    .line 53
    .line 54
    iget-object p0, p0, Lu44;->v:Lj71;

    .line 55
    .line 56
    invoke-virtual {v3, p1}, Ljz0;->h(Ljava/util/List;)Lhf7;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, v1, p1}, Lvf7;->a(Lhf7;Lhf7;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lj71;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    iget-object v0, p0, Lx71;->N:Lhf7;

    .line 68
    .line 69
    iget-object v4, v0, Lhf7;->a:Lvl;

    .line 70
    .line 71
    iget-object v4, v4, Lvl;->x:Ljava/lang/String;

    .line 72
    .line 73
    iget-wide v5, v0, Lhf7;->b:J

    .line 74
    .line 75
    sget v0, Llg7;->c:I

    .line 76
    .line 77
    const/16 v0, 0x20

    .line 78
    .line 79
    shr-long v7, v5, v0

    .line 80
    .line 81
    long-to-int v7, v7

    .line 82
    const-wide v8, 0xffffffffL

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    and-long/2addr v5, v8

    .line 88
    long-to-int v5, v5

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    if-lt v5, v7, :cond_2

    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v4, v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {v1, v4, v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    const-string v3, ") is less than start index ("

    .line 117
    .line 118
    const-string v4, ")."

    .line 119
    .line 120
    const-string v6, "End index ("

    .line 121
    .line 122
    invoke-static {v6, v5, v3, v7, v4}, Lpb4;->k(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3}, Lh;->l(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v3, p0, Lx71;->N:Lhf7;

    .line 134
    .line 135
    iget-wide v3, v3, Lhf7;->b:J

    .line 136
    .line 137
    shr-long/2addr v3, v0

    .line 138
    long-to-int v0, v3

    .line 139
    iget-object p1, p1, Lvl;->x:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    add-int/2addr p1, v0

    .line 146
    invoke-static {p1, p1}, Li95;->a(II)J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    iget-object p0, p0, Lx71;->O:Lu44;

    .line 151
    .line 152
    iget-object p0, p0, Lu44;->v:Lj71;

    .line 153
    .line 154
    new-instance p1, Lhf7;

    .line 155
    .line 156
    const/4 v0, 0x4

    .line 157
    invoke-direct {p1, v0, v3, v4, v1}, Lhf7;-><init>(IJLjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p1}, Lj71;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    :goto_1
    move v2, v3

    .line 165
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_0
    check-cast p1, Lvl;

    .line 171
    .line 172
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 173
    .line 174
    iget-object p1, p1, Lvl;->x:Ljava/lang/String;

    .line 175
    .line 176
    iget-boolean v1, p0, Lx71;->P:Z

    .line 177
    .line 178
    iget-boolean p0, p0, Lx71;->Q:Z

    .line 179
    .line 180
    invoke-static {v0, p1, v1, p0}, Lx71;->Y0(Lu44;Ljava/lang/String;ZZ)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 187
    .line 188
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 189
    .line 190
    invoke-virtual {v0}, Lu44;->d()Lcg7;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_4

    .line 195
    .line 196
    iget-object p0, p0, Lx71;->O:Lu44;

    .line 197
    .line 198
    invoke-virtual {p0}, Lu44;->d()Lcg7;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object p0, p0, Lcg7;->a:Lbg7;

    .line 206
    .line 207
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_4
    move v2, v3

    .line 212
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0

    .line 217
    :pswitch_2
    check-cast p1, Lag;

    .line 218
    .line 219
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 220
    .line 221
    iget-object v0, v0, Lu44;->t:Led5;

    .line 222
    .line 223
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v0, v2}, Led5;->setValue(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 229
    .line 230
    iget-object v0, v0, Lu44;->s:Led5;

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Led5;->setValue(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 236
    .line 237
    iget-object v3, p1, Lag;->a:Landroid/view/autofill/AutofillValue;

    .line 238
    .line 239
    invoke-static {v3}, Lr4;->A(Landroid/view/autofill/AutofillValue;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_5

    .line 244
    .line 245
    iget-object p1, p1, Lag;->a:Landroid/view/autofill/AutofillValue;

    .line 246
    .line 247
    invoke-static {p1}, Lr4;->i(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    check-cast v1, Ljava/lang/String;

    .line 255
    .line 256
    iget-boolean p1, p0, Lx71;->P:Z

    .line 257
    .line 258
    iget-boolean p0, p0, Lx71;->Q:Z

    .line 259
    .line 260
    invoke-static {v0, v1, p1, p0}, Lx71;->Y0(Lu44;Ljava/lang/String;ZZ)V

    .line 261
    .line 262
    .line 263
    return-object v2

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
