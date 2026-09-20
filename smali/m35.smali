.class final Lm35;
.super Lpl4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lm35;",
        "Lpl4;",
        "Lw35;",
        "foundation-layout"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, Lm35;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lm35;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    const/4 p0, 0x0

    .line 17
    invoke-static {p0, p0}, Llx1;->b(FF)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    const/high16 p0, 0x42100000    # 36.0f

    .line 24
    .line 25
    invoke-static {p0, p0}, Llx1;->b(FF)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    return v0

    .line 32
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 33
    return p0
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
.end method

.method public final g()Lll4;
    .locals 1

    .line 1
    new-instance p0, Lw35;

    .line 2
    .line 3
    invoke-direct {p0}, Lll4;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v0, 0x42100000    # 36.0f

    .line 7
    .line 8
    iput v0, p0, Lw35;->K:F

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lw35;->L:Z

    .line 12
    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final h(Lll4;)V
    .locals 3

    .line 1
    check-cast p1, Lw35;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-static {p0, p0}, Llx1;->b(FF)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 v0, 0x42100000    # 36.0f

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget p0, p1, Lw35;->K:F

    .line 17
    .line 18
    invoke-static {p0, v0}, Llx1;->b(FF)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    iget-boolean p0, p1, Lw35;->L:Z

    .line 25
    .line 26
    if-eq p0, v1, :cond_1

    .line 27
    .line 28
    :cond_0
    invoke-static {p1}, Lrc9;->O0(Lvo1;)Luy3;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p0, v2}, Luy3;->Y(Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iput v0, p1, Lw35;->K:F

    .line 37
    .line 38
    iput-boolean v1, p1, Lw35;->L:Z

    .line 39
    .line 40
    return-void
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

.method public final hashCode()I
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    const/16 v0, 0x1f

    .line 7
    .line 8
    mul-int/2addr p0, v0

    .line 9
    const/high16 v1, 0x42100000    # 36.0f

    .line 10
    .line 11
    invoke-static {v1, p0, v0}, Lf21;->d(FII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v0, p0

    .line 21
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, Llx1;->c(F)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const/high16 v0, 0x42100000    # 36.0f

    .line 7
    .line 8
    invoke-static {v0}, Llx1;->c(F)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, ", y="

    .line 13
    .line 14
    const-string v2, ", rtlAware=true)"

    .line 15
    .line 16
    const-string v3, "OffsetModifierElement(x="

    .line 17
    .line 18
    invoke-static {v3, p0, v1, v0, v2}, Lpb4;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method
