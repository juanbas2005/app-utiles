.class public final Lky6;
.super Lkc0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldg3;


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lky6;->a:J

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final a(FJLkb9;)V
    .locals 2

    .line 1
    const/high16 p2, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p4, p2}, Lkb9;->i(F)V

    .line 4
    .line 5
    .line 6
    cmpg-float p2, p1, p2

    .line 7
    .line 8
    iget-wide v0, p0, Lky6;->a:J

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {v0, v1}, Ljt0;->d(J)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    mul-float/2addr p0, p1

    .line 18
    invoke-static {p0, v0, v1}, Ljt0;->b(FJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    :goto_0
    invoke-virtual {p4, v0, v1}, Lkb9;->k(J)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p4, Lkb9;->z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroid/graphics/Shader;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    invoke-virtual {p4, p0}, Lkb9;->n(Landroid/graphics/Shader;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
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

.method public final b(Ljava/lang/Object;F)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lky6;

    .line 4
    .line 5
    sget-wide v0, Ljt0;->f:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1}, Lky6;-><init>(J)V

    .line 8
    .line 9
    .line 10
    :cond_0
    instance-of v0, p1, Lky6;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lky6;

    .line 15
    .line 16
    check-cast p1, Lky6;

    .line 17
    .line 18
    iget-wide v1, p1, Lky6;->a:J

    .line 19
    .line 20
    iget-wide p0, p0, Lky6;->a:J

    .line 21
    .line 22
    invoke-static {p0, p1, v1, v2, p2}, Luq3;->F(JJF)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    invoke-direct {v0, p0, p1}, Lky6;-><init>(J)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lky6;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lky6;

    .line 12
    .line 13
    iget-wide v3, p1, Lky6;->a:J

    .line 14
    .line 15
    iget-wide p0, p0, Lky6;->a:J

    .line 16
    .line 17
    invoke-static {p0, p1, v3, v4}, Ljt0;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, Ljt0;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Lky6;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lky6;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljt0;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "SolidColor(value="

    .line 8
    .line 9
    const-string v1, ")"

    .line 10
    .line 11
    invoke-static {v0, p0, v1}, Lf21;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
