.class public final Ljq6;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final w:Liq6;

.field public final x:F

.field public final y:Led5;

.field public final z:Loq1;


# direct methods
.method public constructor <init>(Liq6;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljq6;->w:Liq6;

    .line 5
    .line 6
    iput p2, p0, Ljq6;->x:F

    .line 7
    .line 8
    new-instance p1, Lwu6;

    .line 9
    .line 10
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, Lwu6;-><init>(J)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Ljq6;->y:Led5;

    .line 23
    .line 24
    new-instance p1, Lhx4;

    .line 25
    .line 26
    const/16 p2, 0x18

    .line 27
    .line 28
    invoke-direct {p1, p2, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lu55;->i(Lsr2;)Loq1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Ljq6;->z:Loq1;

    .line 36
    .line 37
    return-void
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
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, Ljq6;->x:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lar7;->V(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ljq6;->z:Loq1;

    .line 7
    .line 8
    invoke-virtual {p0}, Loq1;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/graphics/Shader;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    return-void
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
